pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout your code from Git
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Build your project
                sh 'mvn clean install'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Configure SonarQube environment
                withSonarQubeEnv('My SonarQube Server') {
                    // Run SonarQube analysis
					def mvn = tool 'Default Maven';
					withSonarQubeEnv() {
						sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=bhushan -Dsonar.projectName='bhushan'"
					}
                    sh 'mvn sonar:sonar'
                }
            }
        }
    }
}

