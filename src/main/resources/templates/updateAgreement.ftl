<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Agreement</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div>
    <fieldset style="display: inline-block">
        <legend>Update agreement</legend>
        <form name="agreement" action="" method="POST">
            Client:<@spring.formSingleSelect  "agreementForm.client" , movs, ""/> <br>
            Document:<@spring.formSingleSelect  "agreementForm.document" , mavs, ""/> <br>
            Price:<@spring.formInput "agreementForm.prise" "" "number"/> <br>
            Commission:<@spring.formInput "agreementForm.commission" "" "number"/> <br>
            Description:<@spring.formInput "agreementForm.description" "" "text"/> <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>
</body>
</html>