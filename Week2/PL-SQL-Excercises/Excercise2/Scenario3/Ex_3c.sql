CREATE OR REPLACE PROCEDURE TransferFunds (
    p_source_account_id      IN NUMBER,
    p_destination_account_id IN NUMBER,
    p_amount                 IN NUMBER
)
AS
    v_source_balance  NUMBER;
    v_count           NUMBER;
BEGIN
    
    IF p_amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Transfer amount must be greater than zero');
    END IF;

    SELECT COUNT(*) INTO v_count
    FROM accounts
    WHERE accountid = p_source_account_id OR accountid = p_destination_account_id;

    IF v_count < 2 THEN
        RAISE_APPLICATION_ERROR(-20002, 'One or both accounts do not exist');
    END IF;

    SELECT balance INTO v_source_balance
    FROM accounts
    WHERE accountid = p_source_account_id;

    IF v_source_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20003, 'Insufficient balance in source account');
    END IF;

    UPDATE accounts
    SET balance = balance - p_amount,
        lastmodified = SYSDATE
    WHERE accountid = p_source_account_id;

    UPDATE accounts
    SET balance = balance + p_amount,
        lastmodified = SYSDATE
    WHERE accountid = p_destination_account_id;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(p_amount || ' transferred from Account ' || p_source_account_id ||
                         ' to Account ' || p_destination_account_id);

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        
END;
/
