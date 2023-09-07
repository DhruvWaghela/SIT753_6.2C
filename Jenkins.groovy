pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "This is a build stage"
            }
        }

        stage('Unit and Integration Tests') {
            steps {
                echo "This is Unit and Integration Tests stage"
            }
        }

        stage('Code Analysis') {
            steps {
                echo "This is Code Analysis stage"
            }
        }

        stage('Security Scan') {
            steps {
                echo "This is Security Scan stage"
            }
        }

        stage('Deploy to Staging') {
            steps {
                echo "This is Deploy to Staging test"
            }
        }

        stage('Integration Tests on Staging') {
            steps {
                echo "This is Integration Tests on Staging stage"
            }
        }

        stage('Deploy to Production') {
            steps {
                echo "This is Deploy to Production stage"
            }
        }
    }
}
