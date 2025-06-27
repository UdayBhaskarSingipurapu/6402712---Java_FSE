DECLARE 

BEGIN
	FOR c IN (select * from Customers)
	LOOP
		IF c.balance > 10000
		THEN
			update Customers set isVip = true where CustomerID = c.CustomerID;
		END IF;
	END LOOP;
END;
/