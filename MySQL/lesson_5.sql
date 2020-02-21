ALTER TABLE `users` 
ADD PRIMARY KEY (`user_id`);

ALTER TABLE `users`
CHANGE COLUMN `user_id` `user_id` INT NOT NULL;