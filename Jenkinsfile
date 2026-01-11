pipeline {
    agent any

    tools {
        jdk 'JDK11'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Ankita0609/saucedemo-e2e.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        failure {
            archiveArtifacts artifacts: 'screenshots/**/*.png', allowEmptyArchive: true
        }
	always {
    	    junit testResults: 'target/surefire-reports/*.xml', allowEmptyResults: true
	}

               }
}
