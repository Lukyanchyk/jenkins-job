folder('TestFolder') {
    displayName('TestFolder')
    description('Folder for XML Seed Jobs')
}

job("seed_job"){
    scm {
        github('Lukyanchyk/jenkins-job', 'main')
    }
    steps {
        shell("""
            ls -l /var/lib/jenkins/jobs/TestFolder/jobs/
            rm -rf /var/lib/jenkins/jobs/TestFolder/jobs/*
            pwd
            ls -l
            mv /var/lib/jenkins/workspace/Test_Seed/jobs/* /var/lib/jenkins/jobs/TestFolder/jobs/
            ls -l /var/lib/jenkins/jobs/TestFolder/jobs/
        """)
    }
}
