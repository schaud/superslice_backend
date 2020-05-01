-- ADD USER ROLES
INSERT INTO user_role VALUES(0, 'Employee');
INSERT INTO user_role VALUES(0, 'Customer');

-- ADD EMPlOYEES(1) AND CUSTOMERS(2)
INSERT INTO usr VALUES(0, 'jesse01', 'epassword', 1);
INSERT INTO usr VALUES(0, 'schaud24', 'cpassword', 2);
INSERT INTO usr VALUES(0, 'raymond02', 'epassword', 1);
INSERT INTO usr VALUES(0, 'mohammed25', 'cpassword', 2);
INSERT INTO usr VALUES(0, 'naibing03', 'cpassword', 2);


-- ADD SAMPLE TICKETS
INSERT INTO ticket (ticket_id, placement_time,status,note,user_id) VALUES (0, CURRENT_TIME(0), 'Pending', 'Call. Dont ring bell.', 6);
INSERT INTO ticket (ticket_id, placement_time,status,note,user_id) VALUES (0, CURRENT_TIMESTAMP(0), 'Pending', 'Call. Dont ring bell.', 6);
INSERT INTO ticket (ticket_id, placement_time,status,note,user_id) VALUES (0, CURRENT_TIMESTAMP(0), 'Pending', 'Extra Hot. Please.', 9);
INSERT INTO ticket (ticket_id, placement_time,status,note,user_id) VALUES (0, CURRENT_TIMESTAMP(0), 'Pending', 'Coming in 15 minutes.', 8);

-- CREATE TOPPING LIST
INSERT INTO topping VALUES(0, 'Pepperoni', 2.00);
INSERT INTO topping VALUES(0, 'Sausage', 2.00);
INSERT INTO topping VALUES(0, 'Bacon', 2.50);
INSERT INTO topping VALUES(0, 'Chicken', 2.00);
INSERT INTO topping VALUES(0, 'Meatballs', 2.50);
INSERT INTO topping VALUES(0, 'Proscuitto', 2.50);
INSERT INTO topping VALUES(0, 'Anchovies', 2.50);
INSERT INTO topping VALUES(0, 'Ham', 2.00);
INSERT INTO topping VALUES(0, 'Mushrooms', 1.00);
INSERT INTO topping VALUES(0, 'Onions', 1.00);
INSERT INTO topping VALUES(0, 'Green Peppers', 1.00);
INSERT INTO topping VALUES(0, 'Red Peppers', 1.00);
INSERT INTO topping VALUES(0, 'Black Olives', 1.00);
INSERT INTO topping VALUES(0, 'Jalapeños', 1.00);
INSERT INTO topping VALUES(0, 'Tomatoes', 1.00);
INSERT INTO topping VALUES(0, 'Broccoli', 1.00);
INSERT INTO topping VALUES(0, 'Roasted Eggplant', 1.00);
INSERT INTO topping VALUES(0, 'Roasted Cauliflower', 1.00);
INSERT INTO topping VALUES(0, 'Extra Cheese', 1.00);
INSERT INTO topping VALUES(0, 'Pineapples', 1.00);

-- ADD SAMPLE PIZZA IDS
INSERT INTO pizza VALUES (0, 1);
INSERT INTO pizza VALUES (0, 2);
INSERT INTO pizza VALUES (0, 3);
INSERT INTO pizza VALUES (0, 4);

-- ADD PIZZA AND TOPPINGS
INSERT INTO pizza_topping VALUES(1, 29);
INSERT INTO pizza_topping VALUES(2, 10);
INSERT INTO pizza_topping VALUES(2, 12);
INSERT INTO pizza_topping VALUES(3, 18);
INSERT INTO pizza_topping VALUES(3, 20);
INSERT INTO pizza_topping VALUES(3, 22);
INSERT INTO pizza_topping VALUES(4, 10);
INSERT INTO pizza_topping VALUES(4, 11);
INSERT INTO pizza_topping VALUES(4, 20);
INSERT INTO pizza_topping VALUES(4, 27);















