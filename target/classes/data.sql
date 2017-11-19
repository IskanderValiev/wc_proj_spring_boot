INSERT INTO users(password, name, lastname, gender, city, telephone, email, id, bday, role, state)
    SELECT '$2a$10$h/fLmIVZSk1yQHu4tSy7IuykVA0Zekh4EESsSPhlv1CEBMVd.vUmy', 'Admin', 'Admin', TRUE, 'Kazan', '123456789','iskand.valiev98@gmail.com',
      1, '1998-01-18', 'ADMIN', 'CONFIRMED'
WHERE not exists(
  SELECT id
  FROM users
  WHERE id = 1
);