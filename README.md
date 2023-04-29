# IvanM-TechnicalAssignement-TraceLabs
In front of you is an interesting project - automation test of the Etherscan registration form. You will notice that most of the tests from the EtherscanSignUpTestSuite will fail because of the Captcha which should be disabled for the purpose of testing. I will just say I ran successfuly all tests in project at least once and can guarantee they will pass in the testing environment. 
I did a lot of manual testing while writing the code and my focus was on functional and UI side I can say everything looks and works fine.
However I noticed that a user can complete the registration process with already used mail and I wrote a test for that scenario EtherscanSuccessfulSignUpUsedEmailTest   I will share some screenshots on this:
![Screenshot_12](https://user-images.githubusercontent.com/107040843/235295167-670b0d91-e516-4804-bb28-02193f4496cf.png)
![Screenshot_13](https://user-images.githubusercontent.com/107040843/235295174-21644136-162f-4bc1-9a92-a7f62eef0206.png)
As can be seen from the mailinator inbox there are several registration welcome mails for the same mail, I couldn't say this is a bug without the documentation but sure is an interesting detail to share.
Regards to all,
Mihonos
