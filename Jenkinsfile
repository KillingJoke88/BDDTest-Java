pipeline {
    agent any
    tools {
        maven 'M2'
        jdk 'JAVA_HOME'
    }
    stages {
        stage ('Initialize') {
            steps {
            	echo 'not using shell'
				bat 'echo step1'

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
