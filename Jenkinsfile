pipeline {

    stages {
        stage('clean workspace') {
            steps {
                cleanWs()
            }
        }

        stage('checkout scm') {
            steps {
                checkout scm
            }
        }

        stage('Run maven verify') {
            steps {
                script {
                    sh 'mvn clean verify'
                }
            }
        }

        stage('Run maven tests') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
    }
}