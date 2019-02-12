pipeline {
    agent any
    tools {
        maven 'M2'
        jdk 'JAVA_HOME'
    }
    stages {
        stage ('Initialize') {
            steps {
            
            	withEnv(["PATH=C:/Program Files/Git/usr/bin;C:/Program Files/Git/bin;]){
						sh '''
							echo "PATH = ${PATH}"
							echo "M2_HOME = ${M2_HOME}"
						'''
            	}

            }
        }

        stage ('Build') {
            steps {
					    sh 'mvn clean install' 
            }
            post {
                success {
					sh ''' 
						echo "Success"
					'''
                }
            }
        }
    }
}
