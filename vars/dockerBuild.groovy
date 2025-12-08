def call(String appName, String imageTag) {
    sh "buildah build --format=docker --isolation=chroot --storage-driver=vfs -t ${appName}:${imageTag} ."
}