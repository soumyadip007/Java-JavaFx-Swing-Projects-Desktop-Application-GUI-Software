pipeline {
    agent {
        label 'windows' // Specify a Windows agent label
    }
    stages {
        stage('SCM') {
            steps {
                checkout scm
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    def mavenHome = tool name: 'Default Maven', type: 'hudson.tasks.Maven$MavenInstallation'
                    bat "\"${mavenHome}\\bin\\mvn.cmd\" clean verify sonar:sonar -Dsonar.projectKey=bhushan -Dsonar.projectName='bhushan'"
                }
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    error("Maven build and SonarQube analysis failed")
                }
            }
        }
    }
}

