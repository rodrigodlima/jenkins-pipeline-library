def call(String appName, String imageTag) {
    sh "buildah build --format=docker -t ${appname:imageTag} ."
}