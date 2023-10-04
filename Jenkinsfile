node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvnHome = tool 'Default Maven';
    def maven = bat(script: "\"${mvnHome}\\bin\\mvn.bat\" clean verify sonar:sonar -Dsonar.projectKey=bhushan -Dsonar.projectName='bhushan'", returnStatus: true)
    
    if (maven != 0) {
      currentBuild.result = 'FAILURE'
      error("Maven build and SonarQube analysis failed")
    }
  }
}
