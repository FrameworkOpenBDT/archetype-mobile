

# Archetype for Mobile Testing Projects
An archetype has the purpose to create projects based on its definitions in the most possible easy way. Starting creating your project following these instructions bellow.

#### Installing the archetype
To generate projects using this archetype, you must install it before. After cloning this repository, inside its folder, type the command
```sh
    mvn install
```
#### Generating a project:
```
    mvn archetype:generate -DarchetypeCatalog=local
```
- Will be asked for a number that represents the archetype already installed (it may appear at the bottom of the console). After that, you have to insert the groupId, artifactId and version (respectively) of the project to be created.
#### Running the sample test:
Inside the project folder that you already created, the file **thucydides.properties** has some attributes that must be changed before running the test.

#### Android
---

- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.host*** to the address where appium or selenium grid is listening on.
- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.app*** to where the apk is located.
- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.deviceName*** to device name.
- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.udid*** to device udid.
- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.platformName*** to platform name (Android).
- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.platformVersion*** to your device platform version.
- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.appActivity*** to the launchable app activity.
- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.appPackage*** to the apk root package.
- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.appWaitActivity*** to the activity to be wait for before the test execution.
- Set the ***webdriver.provided.io.openbdt.driver.MobileCustomDriver.noReset*** to true or false depending if the app must be reinstalled or not before starting it.
- Set where serenity-bdd report will be saved changing the ***serenity.outputDirectory*** value to a folder location in your local file system (may not exist).

After setting the properties above, you can run the test already defined in the project. Inside the project folder type the command

```sh
    mvn verify
```
end the test should be started.