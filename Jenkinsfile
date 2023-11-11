pipeline{
    
    environment {
        registry = "lokeshmamidi99/surveyjar"
        registryCredential = 'docker'
        def dateTag = new Date().format("yyyyMMdd-HHmmss")
	}
agent any
    tools{
        maven 'Maven 3.9.1'
    }
    stages{
     stage('Maven clean & Install'){
        steps{
            script{
                sh 'mvn clean'
                sh 'mvn install'
            }
        }
     }
     stage('Build Docker Image and Push'){
        steps{
            script {
                  docker.withRegistry('',registryCredential) {
                        def image = docker.build('lokeshmamidi99/surveyjar:'+ dateTag, '. --no-cache')
                        docker.withRegistry('',registryCredential) {
                            image.push()
                        }
                    }
            }
        }
     }
      stage('Deploying to single node in Rancher'){
        steps{
            script {
                  sh 'kubectl set image deployment/deploy1 container-0=lokeshmamidi99/surveyjar:'+dateTag
                  sh 'kubectl set image deployment/deploy-lb container-0=lokeshmamidi99/surveyjar:'+dateTag
            }
        }
     }
     }
 
  post {
	  always {
			sh 'docker logout'
		}
	}    
}