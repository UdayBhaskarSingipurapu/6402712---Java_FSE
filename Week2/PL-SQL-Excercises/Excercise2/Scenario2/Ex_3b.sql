SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept_name   IN VARCHAR2,
    p_bonus_pct   IN NUMBER
)
AS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * p_bonus_pct / 100)
    WHERE UPPER(department) = UPPER(p_dept_name);

    DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' employee(s) updated in department "' || 					 UPPER(p_dept_name) || '".');
END;
/
