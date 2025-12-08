def call(String appName, String imageTag) {
    sh "buildah build --format=docker --privileged -t ${appname:imageTag} ."
}