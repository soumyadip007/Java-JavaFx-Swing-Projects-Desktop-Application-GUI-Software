pipeline {
    agent any
    tools {
        // Define the tool name and type (e.g., Maven)
        maven 'Default Maven'
    }
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
                bat 'mvn clean install'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Configure SonarQube environment
                withSonarQubeEnv('My SonarQube Server') {
                    // Run SonarQube analysis
                    bat 'mvn clean verify sonar:sonar -Dsonar.projectKey=bhushan -Dsonar.projectName="bhushan"'
                }
            }
        }
    }
}
