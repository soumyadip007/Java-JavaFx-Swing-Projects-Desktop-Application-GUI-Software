node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def maven = tool name: 'Default Maven', type: 'hudson.tasks.Maven$MavenInstallation'
    bat "\"${maven}\\bin\\mvn.cmd\" clean verify sonar:sonar -Dsonar.projectKey=bhushan -Dsonar.projectName='bhushan'"
    
    if (currentBuild.resultIsWorseOrEqualTo('FAILURE')) {
      error("Maven build and SonarQube analysis failed")
    }
  }
}
