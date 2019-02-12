pipeline {
    agent any
    tools {
        maven 'M2'
        jdk 'JAVA_HOME'
    }
    stages {
        stage ('Initialize') {
            steps {
            
            	withEnv(["PATH=C:\\Program Files\\Git\\usr\\bin;C:\\Program Files\\Git\\bin;C:\\Windows\\System32\\cmd.exe"]){
            			bat '''
							echo "PATH = %PATH%"
							echo "MAVEN_HOME = %MAVEN_HOME%"
						'''
            	}

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
