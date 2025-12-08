def call(String appName, String imageTag) {
    sh "buildah build --format=docker --isolation=chroot -t ${appname:imageTag} ."
}