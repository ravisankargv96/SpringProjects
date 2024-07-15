-- Create the EMPLOYEES table
CREATE TABLE EMPLOYEES (
    ID BIGINT PRIMARY KEY,
    AGE INTEGER,
    DATE_OF_JOINING DATE,
    EMAIL CHARACTER VARYING(255),
    IS_ACTIVE BOOLEAN,
    NAME CHARACTER VARYING(255),
    ROLE CHARACTER VARYING(255),
    SALARY FLOAT(53)
);

-- Insert test data into EMPLOYEES table
INSERT INTO EMPLOYEES (ID, AGE, DATE_OF_JOINING, EMAIL, IS_ACTIVE, NAME, ROLE, SALARY) VALUES
(1, 25, '2021-01-15', 'john.doe@example.com', TRUE, 'John Doe', 'Software Engineer', 70000.00),
(2, 30, '2020-03-22', 'jane.smith@example.com', TRUE, 'Jane Smith', 'Project Manager', 90000.00),
(3, 45, '2018-07-01', 'bob.johnson@example.com', FALSE, 'Bob Johnson', 'Senior Developer', 120000.00),
(4, 28, '2022-05-30', 'alice.williams@example.com', TRUE, 'Alice Williams', 'QA Engineer', 65000.00),
(5, 35, '2019-11-12', 'charlie.brown@example.com', TRUE, 'Charlie Brown', 'DevOps Engineer', 80000.00),
(6, 32, '2021-08-19', 'diana.prince@example.com', FALSE, 'Diana Prince', 'Business Analyst', 75000.00),
(7, 40, '2017-02-14', 'clark.kent@example.com', TRUE, 'Clark Kent', 'Product Owner', 110000.00),
(8, 26, '2023-01-25', 'bruce.wayne@example.com', TRUE, 'Bruce Wayne', 'Intern', 40000.00),
(9, 29, '2020-06-18', 'selina.kyle@example.com', TRUE, 'Selina Kyle', 'UX Designer', 68000.00),
(10, 38, '2016-09-10', 'barry.allen@example.com', FALSE, 'Barry Allen', 'Scrum Master', 95000.00);
