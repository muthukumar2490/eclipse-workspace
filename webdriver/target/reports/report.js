$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/01login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer logs in to the website",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.i_am_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check page title",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_check_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username only",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_username_only()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button1",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_Login_button1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for error message",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_check_for_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter wrong password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_wrong_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button2",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_Login_button2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for alert",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_check_for_alert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter correct details",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_correct_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login Button3",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_Login_Button3()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect to go to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_expect_to_go_to_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/02booking.feature");
formatter.feature({
  "name": "Booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer goes to Booking Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingDefinition.i_am_on_the_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check the page title",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_the_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click confirm booking button",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_click_confirm_booking_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for alert for first name",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_for_alert_for_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter first name and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_first_name_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for alert for last name",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_for_alert_for_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter last name and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_last_name_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for alert for email",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_for_alert_for_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_email_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for alert for mobile number",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_for_alert_for_mobile_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid mobile no and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_invalid_mobile_no_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for alert for contact no",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_for_alert_for_contact_no()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter contact no and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_contact_no_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check alert for city",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_alert_for_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select city and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_select_city_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check alert for state",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_alert_for_state()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select state and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_select_state_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check alert for cardholder name",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_alert_for_cardholder_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter cardholder name and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_cardholder_name_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for alert for debit card number",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_for_alert_for_debit_card_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter card details and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_card_details_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check alert for cvv",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_alert_for_cvv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter cvv and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_cvv_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check alert for exp month",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_alert_for_exp_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter exp month and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_exp_month_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check alert for exp year",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_check_alert_for_exp_year()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter exp year and click confirm booking",
  "keyword": "When "
});
formatter.match({
  "location": "BookingDefinition.i_enter_exp_year_and_click_confirm_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should go to success page",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingDefinition.i_should_go_to_success_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/03bookingSuccess.feature");
formatter.feature({
  "name": "Success",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Success Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Success page",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingSuccessDefinition.i_am_on_Success_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i check page title",
  "keyword": "When "
});
formatter.match({
  "location": "BookingSuccessDefinition.i_check_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingSuccessDefinition.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});