-- Tabla roles
CREATE TABLE roles (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(255) NOT NULL UNIQUE
);

-- Tabla users
CREATE TABLE users (
 id BIGINT AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(255) NOT NULL UNIQUE,
 password VARCHAR(255) NOT NULL,
 role_id BIGINT NOT NULL,
  CONSTRAINT fk_role FOREIGN KEY (role_id) REFERENCES roles (id) ON DELETE CASCADE
);

-- Tabla leads
CREATE TABLE leads (
   id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL UNIQUE,
  status VARCHAR(50) NOT NULL DEFAULT 'new',
  user_id BIGINT NOT NULL,
 created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

-- Tabla activities
CREATE TABLE activities (
 id BIGINT AUTO_INCREMENT PRIMARY KEY,
lead_id BIGINT NOT NULL,
description TEXT NOT NULL,
 activity_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 user_id BIGINT NOT NULL,
 CONSTRAINT fk_lead FOREIGN KEY (lead_id) REFERENCES leads (id) ON DELETE CASCADE,
 CONSTRAINT fk_activity_user FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);
