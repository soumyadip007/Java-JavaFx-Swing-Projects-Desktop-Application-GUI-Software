pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('SonarQube Analysis') {
            environment {
                scannerHome = tool name: 'SonarScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
            }
            steps {
                script {
                    def scannerHome = tool name: 'SonarScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                    withSonarQubeEnv('bhushan') {
                        bat "C:\\SonarQube\\sonar-scanner-5.0.1.3006-windows\\bin\\sonar-scanner.bat"

                    }
                }
            }
        }
    }
}
