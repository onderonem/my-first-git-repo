public class FirstJavaClass {
    public static void main(String[] args) {
        System.out.println("Leaning github");
        System.out.println("yes");
        System.out.println("done");

       /* Day1
                -----
                STEP 1: Create a project on intelJ
        Open ypur intellij
        Click on New Project/File>New>Project
        Click Next Next
        Name : my_github_project
                ----------------------
        STEP 2: CREATE GITHUB REPOSITORY
                *Repository(git repo) means github project folders. We must create a repository to store projects.
*We already installed git.
*****Steps for creating a repository
        https://github.com/ and login
 ***. click on your profile
***. click on your Repositories ***. click on New
                ***. repository name : my-first-git-repo
                ***. select public or private then create
        ---------------------
                STEP 3: PUSH THE FIRST CODE TO GUTHUB
*Open intellij terminal
                *Then follow the instruction on github!!!!
                *git init
        : Done only once for each project.This is used for initilizing the project. This will create .git forlder to store the project versions!!!
                NOTE: If you see :  The term 'git' is not recognized
        It means github installation is not complete
        Then get in touch with teach support
                *git add .
        : Done after each code change.
        : Adds the code in the staging area
                *git commit -m "my first commit"
        : Done after each code change
        : This is used for creating new version of the project
                *git branch -M main
        :Done once for each project
        *git remote add origin https://github.com/abayramus/my-first-git-repo.git
        :Done once for each project
        *git push -u origin main
        :Done once for each project
***If your code is successfully pushed, then you should refresh your github and see your code in github
        DONE*****
*********Git Push Practice*********
        After the first push, we do not use some of teh git commets that we used in the first commit.
        1. Create a new java class under src : FirstJavaClass
        2. Create a main method and write code:
        public class FirstJavaClass {
            public static void main(String[] args) {
                System.out.println("Learning github");
            }
        }
        3. Then push this code to the same repository
                *git add .
                *git commit -m "second commit"
                *git push
                ***********************************************
        HOW TO PULL THE CODE FROM GITHUB TO LOCAL COMPUTER
*Create a new file : test_file.txt
                *Add some comments :
        Do not delete this file.
                This file is Ms. Filiz's code
                *Commit new file
                ***Now we created a file in github
        We will get that code from github to intelliJ.
                In intelliJ terminal write below commend to pull the code
                *git pull
                ***USEFULL COMMANDS:
        git status :
        This is our friend
        We see the status of our codes
        We can use this anytime to see where you are


*/



    }
}
