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
				bat 'git add essai.xml' 
				bat 'git commit'
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
