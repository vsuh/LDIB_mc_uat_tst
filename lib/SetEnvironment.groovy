
// def getJenkinsMaster() {
//     // env.JN_JN_BUILD_URL contains address which is specified in Jenkins global settings:
//     // Jenkins Location -> Jenkins URL
//     return env.JN_BUILD_URL.split('/')[2].split(':')[0]
// }

env.JN_VERBOSE = "true"
env.JN_EMAIL_ADDRESS_FOR_NOTIFICATIONS = "sukhikh@moscollector.ru"

env.JN_PLATFORM_1C_VERSION = "8.3.18.1483"
env.JN_PLATFORM_1C_VERSION_FOR_STORAGE = "8.3.17.1700"

if (isUnix()) {
    env.JN_INSTALLATION_DIR_1C = "/opt/1C/v8.3/x86_64"
    env.JN_THICK_CLIENT_1C = env.JN_INSTALLATION_DIR_1C + "/1cv8"
    env.JN_THICK_CLIENT_1C_FOR_STORAGE = env.JN_THICK_CLIENT_1C
    env.JN_ONE_SCRIPT_PATH="/usr/bin/oscript"
} else {
    env.JN_INSTALLATION_DIR_1C = "C:/Program Files/1cv8"
    env.JN_ONE_SCRIPT_PATH="C:/Program Files (x86)/OneScript/oscript.exe"
    env.JN_THICK_CLIENT_1C = env.JN_INSTALLATION_DIR_1C + "/" + env.JN_PLATFORM_1C_VERSION + "/bin/1cv8.exe"
    env.JN_THICK_CLIENT_1C_FOR_STORAGE = env.JN_INSTALLATION_DIR_1C + "/" + env.JN_PLATFORM_1C_VERSION_FOR_STORAGE + "/bin/1cv8.exe"
}

// Здесь можно написать например  if(env.JN_HOSTNAME == "node1") { env.JN_SQL_SERVER = "node2" }
env.JN_SQL_SERVER = "obr-sql-01"
env.JN_SQL_USER = "SQL_SUPER"
env.JN_SQL_PASSWORD = "SUPER_PWD"

env.JN_CLUSTER_1C_HOST = "obr-app-11"
env.JN_CLUSTER_1C_MANAGER_PORT = "1541"
env.JN_CLUSTER_1C_AGENT_PORT = "1540"
env.JN_RAS_HOST = "obr-app-11"
env.JN_RAS_PORT = "1545"

env.JN_tst_CLUSTER_1C_HOST = "obr-app-13"
env.JN_tst_CLUSTER_1C_MANAGER_PORT = "1541"
env.JN_tst_CLUSTER_1C_AGENT_PORT = "1540"
env.JN_tst_RAS_HOST = "obr-app-13"
env.JN_tst_RAS_PORT = "1545"

// env.JN_INIT_TEMPLATE_DATABASE_WITH_EPF_INSTEAD_OF_EXTENTION = "true"
// env.JN_INIT_TEST_DATABASE_WITH_EPF_INSTEAD_OF_EXTENTION = "false"

// env.JN_TEMPLATE_FILE_FOR_EMPTY_DT = "/home/vagrant/shared_ci/cf_template/1cv8.cf"

// env.JN_DIRECTORY_TO_DUMP_EMPTY_DT = "/home/vagrant/shared_ci/database_images"
// env.JN_FILE_NAME_POSTFIX_FOR_EMPTY_DT = ""

// env.JN_NAME_OF_1C_ADMIN_USER = "_autotest_admin"
// env.JN_NAME_OF_1C_REGULAR_USER = "_autotest_user"
// env.JN_PASSWORD_FOR_1C_USERS = "123"

// env.JN_TEST_EXTENSION_NAME = "testing"
// env.JN_VANESSA_EPF = "/home/vagrant/shared_ci/vanessa-automation/vanessa-automation.epf"

// На разных окружениях может быть разный путь к хранилищу, 
// Окружение можно определять по имени мастер-узла Jenkins, если оно разное на разных хостовых серверах
// if (getJenkinsMaster().toLowerCase().contains("host")) {
//     env.JN_CONFIGURATION_STORAGE_ADDRESS = "tcp://host.local:1642/storate_test"
// }
// else {
//     env.JN_CONFIGURATION_STORAGE_ADDRESS = "tcp://some-other-host:1742/storate_test"
// }
env.JN_CONFIGURATION_STORAGE_ADDRESS = "tcp://SRV-GR-1CSTORAGE83/Moscoll_fr1"

// env.JN_CONFIGURATION_STORAGE_USER = "Сухих2"
// env.JN_CONFIGURATION_STORAGE_PASSWORD = "0147"
// env.JN_FIRST_CONFIGURATION_STORAGE_VERSION_TO_DUMP = "4"
// env.JN_DIRECTORY_WITH_STORAGE_VERSIONS = "/home/vagrant/shared_ci/storage_versions"

// env.JN_GET_STORAGE_VERSIONS_FROM_CF_FILES = "true"
// env.JN_MAXIMUM_NUMBER_OF_CF_FILES_TO_STORE_IN_STORAGE_DUMP_DIRECTORY = "3"
// env.JN_ALWAYS_DELETE_STORAGE_VERSION_CF_FILE_AS_POST_ACTION = "true"

// env.JN_MAIN_TESTING_JOB_NAME = "main_build"
// env.JN_PERSISTENT_ALLURE_REPORT_DIRECTORY = "/home/vagrant/shared_ci/allure/ci_for_1c"

// env.JN_TIMEOUT_FOR_CREATE_EMPTY_DT_STAGES = "60"
// env.JN_TIMEOUT_FOR_STARTING_BUILD_JOB = "120"
// env.JN_TIMEOUT_FOR_DETECTING_VERSION_TO_BUILD = "5"
// env.JN_TIMEOUT_FOR_CHECKING_CHANGES_IN_STORAGE_IN_MINUTES = "60"
// env.JN_TIMEOUT_FOR_DUMPING_CF_FILE_FROM_STORAGE_IN_MINUTES = "120"
// env.JN_TIMEOUT_FOR_LOADING_DT_FILE = "30"
// env.JN_TIMEOUT_FOR_LOADING_STORAGE_VERSION = "60"
// env.JN_TIMEOUT_FOR_LOADING_TEST_EXTENSION = "30"
// env.JN_TIMEOUT_FOR_DATABASE_INITIALIZATION = "60"
// env.JN_TIMEOUT_FOR_PREPARATORY_SCENARIOS = "60"
// env.JN_TIMEOUT_FOR_MAIN_SCENARIOS = "180"
