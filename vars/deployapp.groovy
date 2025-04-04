// vars/deployApp.groovy
def call(Map config) {
    echo "Deploying application to ${config.environment}"
    // Logic for deploying the app based on the environment and config
    sh "deploy --app ${config.appName} --env ${config.environment}"
}
