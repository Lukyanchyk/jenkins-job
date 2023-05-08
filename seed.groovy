folder('TestFolder') {
    displayName('TestFolder')
    description('Folder for XML Seed Jobs')
}

job("TestFolder/test_seed"){
    scm {
        github('Lukyanchyk/jenkins-job.git', 'main')
    }
    steps {
        shell("""
            ls -l /var/lib/jenkins/jobs/TestFolder/jobs/
            rm -rf /var/lib/jenkins/jobs/TestFolder/jobs/*
            pwd
            ls -l
            mv /var/lib/jenkins/workspace/TestFolder/test_seed/jobs/* /var/lib/jenkins/jobs/TestFolder/jobs/
            ls -l /var/lib/jenkins/jobs/TestFolder/jobs/
        """)
    }
}
