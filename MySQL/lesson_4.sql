CREATE TABLE `transactions` (
  `transaction_id` INT NOT NULL,
  `transaction_date` DATETIME NULL,
  `amount` DECIMAL(2) NULL,
  `type` VARCHAR(1) NULL,
  PRIMARY KEY (`transaction_id`));