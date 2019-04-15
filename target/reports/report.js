$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/accounts/dataTable.feature");
formatter.feature({
  "name": "Data Tables",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dataset"
    }
  ]
});
formatter.scenario({
  "name": "Creating Contact only with mandatory fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dataset"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Contact tab",
  "keyword": "Given "
});
formatter.match({
  "location": "DataTables.onContactTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click New button",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables.clickNewButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter mandatory data",
  "rows": [
    {
      "cells": [
        "Last Name",
        "Contact Currency",
        "Is Resource Active",
        "Is Resource"
      ]
    },
    {
      "cells": [
        "Chaliki",
        "USD",
        "True",
        "True"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataTables.mandatoryData(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save",
  "keyword": "When "
});
formatter.match({
  "location": "DataTables.clickSave()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new Contact should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTables.newContactCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be navigated to newly created contact page",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables.navigatedToContactPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating Contact with fields user wants",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dataset"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Contact tab",
  "keyword": "Given "
});
formatter.match({
  "location": "DataTables.onContactTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click New button",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables.clickNewButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter below data",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Region",
        "Resource Role",
        "Is Resource Active",
        "Is Resource",
        "Work Calendar"
      ]
    },
    {
      "cells": [
        "Ambi",
        "Chaliki",
        "United Kingdom",
        "Test Analyst",
        "True",
        "True",
        "Global"
      ]
    },
    {
      "cells": [
        "Sahasra",
        "Chaliki",
        "India",
        "Trainee",
        "True",
        "True",
        "Global"
      ]
    },
    {
      "cells": [
        "Jack",
        "Jill",
        "USA",
        "Developer",
        "False",
        "False",
        "USA"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataTables.enterData(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save",
  "keyword": "When "
});
formatter.match({
  "location": "DataTables.clickSave()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new Contact should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTables.newContactCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be navigated to newly created contact page",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables.navigatedToContactPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating copy with special characters",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dataset"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Contact tab",
  "keyword": "Given "
});
formatter.match({
  "location": "DataTables.onContactTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click New button",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables.clickNewButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter below data",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Region",
        "Resource Role",
        "Is Resource Active",
        "Is Resource",
        "Work Calendar"
      ]
    },
    {
      "cells": [
        "@£$%%",
        ")**\u0026^%$",
        "United Kingdom",
        "Test Analyst",
        "True",
        "True",
        "Global"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataTables.enterData(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save",
  "keyword": "When "
});
formatter.match({
  "location": "DataTables.clickSave()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new Contact should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTables.newContactCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be navigated to newly created contact page",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables.navigatedToContactPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});