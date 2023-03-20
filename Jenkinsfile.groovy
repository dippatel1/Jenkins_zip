pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/dippatel1/Jenkins_zip.git'
            }
        }
    }
}
