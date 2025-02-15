INSERT INTO notifications (message, status) VALUES ('Nova notificação 1', 'PENDING')
ON CONFLICT DO NOTHING;
INSERT INTO notifications (message, status) VALUES ('Nova notificação 2', 'PENDING')
ON CONFLICT DO NOTHING;