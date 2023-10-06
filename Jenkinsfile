pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
                }
            }
        stage('SCM') {
            steps {
                // Checkout the code from Git
                checkout([$class: 'GitSCM', 
                          branches: [[name: '*/main']], 
                          doGenerateSubmoduleConfigurations: false, 
                          extensions: [], 
                          submoduleCfg: [], 
                          userRemoteConfigs: [[url: 'https://github.com/BhushanShete/Java-JavaFx-Swing-Projects-Desktop-Application-GUI-Software.git']]])
            }
        }

        stage('SonarQube Analysis') {
            environment {
                scannerHome = tool name: 'SonarScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
            }
            steps {
                script {
                    def scannerHome = tool name: 'SonarScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                    def mvn = tool 'mvn';
                    withSonarQubeEnv('bhushan') {
                        bat "${mvn} clean verify sonar:sonar -Dsonar.projectKey=java2- -Dsonar.projectName='java2-'"

                    }
                }
            }
        }
    }
}
