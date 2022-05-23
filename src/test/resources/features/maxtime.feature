#autor: Julian
  @stories

  Feature: report time in maxtime
    as a user, i want to report my time in the aplication maxtime

    @scenario1
    Scenario Outline: report time
      Given he enters in the aplication with the correct credentials
        | userName   | password   |
        | <userName> | <password> |
      And he select a day to report in the menu
      When he fill the parameters
        | project   | hourType   | service   | activity   | hoursExecuted  | commentary   |
        | <project> | <hourType> | <service> | <activity> | <hoursExecuted> | <commentary> |
      Then he look the menu <label>

      Examples:

      | userName | password    | project | hourType | service            | activity        | hoursExecuted | commentary             | label                      |
      | cricoc   | Aokiji.22   | banking | choucair | generales clásicas | formacion guias | 9             | automatizacion maxtime | Días pendientes por cerrar |
