pipeline {
    agent any
    tools {
    // Make sure the name matches the one configured in Jenkins
    maven 'mvn'
    }

    
    stages {
        stage('SCM') {
            steps {
                // Checkout the code from Git
                checkout([$class: 'GitSCM', 
                          branches: [[name: '*/master']], 
                          doGenerateSubmoduleConfigurations: false, 
                          extensions: [], 
                          submoduleCfg: [], 
                          userRemoteConfigs: [[url: 'https://github.com/BhushanShete/Hotel-Management-Project-Java.git']]])
            }
        }
        
        stage('SonarQube Analysis') {
            steps {
                // Set up environment variables for SonarQube
                withSonarQubeEnv('bhushan') {
                    // Run Maven clean
                    bat 'mvn clean'
                    
                    // Run Maven verify
                    bat 'mvn verify'
                    
                    // Run SonarQube analysis
                    bat 'mvn clean verify sonar:sonar -Dsonar.projectKey=bhushan -Dsonar.projectName=\'bhushan\''

                }
            }
        }
    }
}
