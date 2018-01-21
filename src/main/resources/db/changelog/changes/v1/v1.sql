CREATE TABLE `book` (
  `id`         BIGINT(20)   NOT NULL AUTO_INCREMENT,
  `author`     VARCHAR(255) NOT NULL,
  `created_at` DATETIME     NOT NULL,
  `deleted_at` DATETIME              DEFAULT NULL,
  `isbn`       VARCHAR(255) NOT NULL,
  `title`      VARCHAR(255) NOT NULL,
  `updated_at` DATETIME              DEFAULT NULL,
  `year`       INT(11)      NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE utf8_general_ci;