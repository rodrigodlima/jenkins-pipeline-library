def call(String appName, String imageTag) {
    sh "docker build -t ${appname:imageTag} . "
}