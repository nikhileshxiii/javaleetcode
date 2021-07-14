pipeline {
    agent any
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
            agent {
                docker {
                    image 'maven:3.8.1-openjdk-16'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                script {
                    sh 'mvn clean verify'
                }
            }
        }

        stage('Run maven tests') {
            agent {
                docker {
                    image 'maven:3.8.1-openjdk-16'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
    }
}