SELECT 'Upgrading Sentry store schema from 1.6.0 to 1.7.0' AS ' ';

UPDATE SENTRY_VERSION SET SCHEMA_VERSION='1.7.0', VERSION_COMMENT='Sentry release version 1.7.0' WHERE VER_ID=1;

SELECT 'Finish upgrading Sentry store schema from 1.6.0 to 1.7.0' AS ' ';