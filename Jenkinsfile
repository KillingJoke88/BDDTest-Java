pipeline {
    agent any
    tools {
        maven 'M2'
        jdk 'JAVA_HOME'
    }
    stages {
        stage ('Initialize') {
            steps {
            	bat 'echo %PATH%'
            }
        }

        stage ('Build') {
            steps {
					    bat 'mvn clean install' 
            }
            post {
                success {
					bat ''' 
						echo "Success"
					'''
                }
            }
        }
    }
}
