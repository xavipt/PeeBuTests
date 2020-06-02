$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Mestrado/SoftwareQuality/Master/PeeBuTests/include/features/CheckAllTransactions.feature");
formatter.feature({
  "name": "Check All Transactions",
  "description": "  As a user I want to navigate to the PeeBuTests HomePage\n  So that I can see all the Money Transactions",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "I check if the data presented is the data that should be presented",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I Check if the \u003ccolumn\u003e match their \u003ccontent\u003e of the list",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "column",
        "content"
      ]
    },
    {
      "cells": [
        "\u0027Entidade\u0027",
        "\u0027Gislason - Rau\u0027"
      ]
    },
    {
      "cells": [
        "\u0027Tipo\u0027",
        "\u0027debit\u0027"
      ]
    },
    {
      "cells": [
        "\u0027Fonte\u0027",
        "\u0027cash\u0027"
      ]
    },
    {
      "cells": [
        "Data",
        "\u00272019-09-16T131955227Z\u0027"
      ]
    },
    {
      "cells": [
        "Quantidade",
        "\u0027433,10\u0027"
      ]
    },
    {
      "cells": [
        "\u0027Id\u0027",
        "2"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser open",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckHomePageTitleStepDefenition.i_have_the_browser_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the home page",
  "keyword": "When "
});
formatter.match({
  "location": "CheckHomePageTitleStepDefenition.i_navigate_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I check if the data presented is the data that should be presented",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I Check if the \u0027Entidade\u0027 match their \u0027Gislason - Rau\u0027 of the list",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckAllTransactionsStepDef.i_Check_if_the_match_their_of_the_list(String,String)"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Verify element text of test object \u0027Object Repository/Page_PeeBu/td_Gislason - Rau\u0027 FAILED.\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword.verifyElementText(VerifyElementTextKeyword.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword.execute(VerifyElementTextKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementText(WebUiBuiltInKeywords.groovy:3663)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementText$1.call(Unknown Source)\r\n\tat CheckAllTransactionsStepDef.i_Check_if_the_match_their_of_the_list(CheckAllTransactionsStepDef.groovy:70)\r\n\tat ✽.I Check if the \u0027Entidade\u0027 match their \u0027Gislason - Rau\u0027 of the list(D:/Mestrado/SoftwareQuality/Master/PeeBuTests/include/features/CheckAllTransactions.feature:10)\r\nCaused by: com.kms.katalon.core.exception.StepFailedException: Actual text \u0027433.10\u0027 and expected text \u0027Gislason - Rau\u0027 of test object \u0027Object Repository/Page_PeeBu/td_Gislason - Rau\u0027 are NOT matched.\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword$_verifyElementText_closure1.doCall(VerifyElementTextKeyword.groovy:57)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword$_verifyElementText_closure1.call(VerifyElementTextKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword.verifyElementText(VerifyElementTextKeyword.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword.execute(VerifyElementTextKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementText(WebUiBuiltInKeywords.groovy:3663)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementText$1.call(Unknown Source)\r\n\tat CheckAllTransactionsStepDef.i_Check_if_the_match_their_of_the_list(CheckAllTransactionsStepDef.groovy:70)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:169)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat TestCaseCheckAllTransactions.run(TestCaseCheckAllTransactions:18)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:337)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:328)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:307)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:299)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:233)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:169)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:142)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:91)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1591110266085.run(TempTestSuite1591110266085.groovy:36)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser open",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckHomePageTitleStepDefenition.i_have_the_browser_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the home page",
  "keyword": "When "
});
formatter.match({
  "location": "CheckHomePageTitleStepDefenition.i_navigate_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I check if the data presented is the data that should be presented",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I Check if the \u0027Tipo\u0027 match their \u0027debit\u0027 of the list",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckAllTransactionsStepDef.i_Check_if_the_match_their_of_the_list(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser open",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckHomePageTitleStepDefenition.i_have_the_browser_open()"
});
