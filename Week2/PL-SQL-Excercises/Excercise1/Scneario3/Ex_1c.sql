 SET SERVEROUTPUT ON;

BEGIN
	FOR c IN ( select * from customers cust
		   JOIN Loans l ON
		   cust.CustomerID = l.CustomerID
		   where l.ENDDATE - SYSDATE <= 30 )
	LOOP
		DBMS_OUTPUT.PUT_LINE(c.name || 'Your due is in next 30 days');
	END LOOP;
END;
/