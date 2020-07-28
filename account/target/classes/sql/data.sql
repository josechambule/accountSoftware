INSERT INTO account(id, accountnumber, balance, creationdate) VALUES(10001, 100001, 500, GETDATE());
INSERT INTO account(id, accountnumber, balance, creationdate) VALUES(10002, 100002, 200, GETDATE());
INSERT INTO account(id, accountnumber, balance, creationdate) VALUES(10003, 100003, 405, GETDATE());
INSERT INTO account(id, accountnumber, balance, creationdate) VALUES(10004, 100004, 625, GETDATE());
INSERT INTO account(id, accountnumber, balance, creationdate) VALUES(10005, 100005, 485, GETDATE());
INSERT INTO account(id, accountnumber, balance, creationdate) VALUES(10006, 100006, 369, GETDATE());
INSERT INTO account(id, accountnumber, balance, creationdate) VALUES(10007, 100007, 162, GETDATE());
INSERT INTO account(id, accountnumber, balance, creationdate) VALUES(10008, 100008, 852, GETDATE());

INSERT INTO moviment(id, movimenttype, value, movimentdate, details, accountid) VALUES(10001, 'D', 500, GETDATE(), 'deposit', 10001);
INSERT INTO moviment(id, movimenttype, value, movimentdate, details, accountid) VALUES(10002, 'D', 200, GETDATE(), 'deposit', 10002);
INSERT INTO moviment(id, movimenttype, value, movimentdate, details, accountid) VALUES(10003, 'D', 405, GETDATE(), 'deposit', 10003);
INSERT INTO moviment(id, movimenttype, value, movimentdate, details, accountid) VALUES(10004, 'D', 625, GETDATE(), 'deposit', 10004);
INSERT INTO moviment(id, movimenttype, value, movimentdate, details, accountid) VALUES(10005, 'D', 485, GETDATE(), 'deposit', 10005);
INSERT INTO moviment(id, movimenttype, value, movimentdate, details, accountid) VALUES(10006, 'D', 369, GETDATE(), 'deposit', 10006);
INSERT INTO moviment(id, movimenttype, value, movimentdate, details, accountid) VALUES(10007, 'D', 162, GETDATE(), 'deposit', 10007);
INSERT INTO moviment(id, movimenttype, value, movimentdate, details, accountid) VALUES(10008, 'D', 852, GETDATE(), 'deposit', 10008);