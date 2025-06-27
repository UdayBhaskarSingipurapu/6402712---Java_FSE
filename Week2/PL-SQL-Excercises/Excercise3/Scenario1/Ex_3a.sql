SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest 
AS
BEGIN
	update accounts
	set balance = balance + (balance * .01)
	where upper(ACCOUNTTYPE) = 'SAVINGS';
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('All accounts updated successfully');
END;
/