package com.inspire.spriyal.techfest;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
//import android.support.v4.app.Fragment;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



public class FragmentA extends android.support.v4.app.Fragment {

    Integer pane=0;
    View v;
        String[] dates = new String[]{"17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March","17 & 18 March"};
    //Integer[] images = new Integer[]{R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag,R.drawable.bhag};
    Integer[] images = new Integer[]{R.drawable.quizocmania,R.drawable.flowbid,R.drawable.passpprog,R.drawable.gammingdeck,R.drawable.robomath,R.drawable.roborugby,R.drawable.bhag,R.drawable.techostormy,R.drawable.mindmaze,R.drawable.rays,R.drawable.war,R.drawable.knock,R.drawable.estructura,R.drawable.urbanamaze,R.drawable.grave,R.drawable.cad,R.drawable.hydra,R.drawable.elast,R.drawable.ripple,R.drawable.crawl,R.drawable.hunt,R.drawable.ipl,R.drawable.photoex,R.drawable.lapho,R.drawable.paper,R.drawable.poster,R.drawable.model,R.drawable.gender};
    String[] event_name = new String[]{"Quizo 'C' Mania","Flow 'B'id","Pass 'P'rog","Gaming 'D'eck","Robo Mathematics","Robo Rugby","Bhag Robo Bhag","TechoStormy","Mind Maze","Rays of Hope","War of Machines","Knockout","Estructura","Urban-Amaze","Grave The Junk","CAD ART","Hydra Matic","Elast-O-Mania","Ripple Hire","Crawl-Walker","Play The Hunt","IPL-Auction","Photo Exhibition","La Photographie","Paper Presentation","Poster Presentation","Model Presentation","Gender Related Poster Presentation"};
    String[] event_desc = new String[]{"Online test on ‘C’ programming language. (MCQ - Multiple Choice Questions)\n" +
            "\n" +
            "Rules :\n" +
            "\n" +
            "Test consists of:\n" +
            "30 Questions\n" +
            "30 Minutes\n" +
            "30 Marks\n" +
            "Number of elimination rounds will depend on total number of participants.\n" +
            "No negative marking.\n" +
            "Single student participation.","A Flow Diagram have to be drawn based on a given topic.\n" +
            "\n" +
            "Rules :\n" +
            "\n" +
            "Topic will be given at the time of event.\n" +
            "Participant will be given real world problem on which they have to draw the flow diagram.\n" +
            "After the 1st round those who are going for the 2nd round will be given other participants drawn diagram and they have to comment(Bid) on that and find mistake,based on this winner will be declared.\n" +
            "45 minutes will be given for the 1st round.\n" +
            "Participants will be provided sheets from college and all other stationary like(marker pen,sketch pen,etc.) they have to bring by there own.\n" +
            "It will be an individual event.\n" +
            "Evaluation Criteria:\n" +
            "\n" +
            "Content Relevance\n" +
            "User Interface & Features\n","Coding competition for programming harmonization of two students.\n" +
            "\n" +
            "Rules :\n" +
            "\n" +
            "Statement will be given at the time of event.\n" +
            "Platform : Ubuntu.\n" +
            "Language : ‘C'\n" +
            "Time Limit: 60 minutes.\n" +
            "First 30 Minutes will be allocated to first participant and remaining 30 minutes will be allocated to second participants, without any communication.\n" +
            "Group event (Exact 2 participants).\n" +
            "Evaluation Criteria:\n" +
            "\n" +
            "Coordination & Problem Completion Level\n" +
            "Next","Charge yourself with LAN gaming.\n" +
            "\n" +
            "Games :\n" +
            "\n" +
            "Counter Strike\n" +
            "NFS(Most Wanted)\n" +
            "FIFA'16\n" +
            "Rounds :\n" +
            "\n" +
            "Winners of the 1st round will play in the 2nd round.\n" +
            "Number of Rounds and Time Duration will be decided at the time of event.Winners are declared on the basis of Final Round.\n" +
            "Those who want to bring their own controller can bring.\n" +
            "Team Specification :\n" +
            "\n" +
            "NFS,FIFA:Individual\n" +
            "CounterStrike :(4 participants in a group)\n","Description : \n" + "Robo mathematics means mathematical operations will be done by the robot. In the operation, particular numerical will be given like 3+3=6, 8*5=40. On one side of the platform, all the blocks containing numbers and signs will be placed. Robot has to pick/drag a particular numbers and sign given in a numerical and have to place it on another side of the platform." + "Rules: \n" + "There will be min 2 and max 4 participants per team.\n" +
            "Size of robot will be 30 cm. X 30 cm.\n" +
            "Student from different colleges can form a team.\n" +
            "Robot will be driven through remote, no human interference will be allowed.\n" +
            "All the blocks should be placed in series.\n" +
            "Judging criteria will be based on time limit.\n" +
            "Each team will stand outside the area to control particular robot.\n" +
            "Kindly ensure that the robot will not damage the maze. If done than the team would be disqualified.\n" +
            "The organizers decision will be final on the issue of conflict.\n" +
            "The organizers reserve the right to make any change in the rules and the event pattern. Any significant change in the rule will be highlighted before the commencement of event.","Both teams will start from their respective start point. One Participant will control the robot and other will give him support (can hold battery). Ball will be placed in center and the team has to drag ball to other side and pass the ball through goal post.\n" +
            "\n" +
            "Rules:\n" +
            "\n" +
            "Per team maximum two students.\n" +
            "The robot must be of dimensions 30 cm x 30 cm x 30 cm and maximum weight of robot can be 5kg.\n" +
            "The team which scores max goals in a given time will be considered for the next round.\n" +
            "The robot cannot be constructed using ready-made LEGO KIT or IC engine or any kind of ready-made mechanism but you can make use of readymade gear assemblies.\n" +
            "The destruction of other team robot is not allowed.\n" +
            "Each team is allowed to have only one robot.\n" +
            "The decision of organizing committee will be final.\n" +
            "The supply should not be of more than 24 V.","Build a robot such that it can overcome every obstacle on its path and complete the given track in least period of given time.\n" +
            "\n" +
            "Rules:\n" +
            "\n" +
            "Each team is allowed to have only one robot.\n" +
            "Maximum number of members in a team is four.\n" +
            "The robot must fit into a cube of dimensions 30 cm x 30 cm x 30 cm and maximum weight of robot can be 5kg.\n" +
            "The maximum voltage difference between any two points must not exceed 24V.\n" +
            "The robot cannot be constructed using ready-made LEGO KIT or any kind of ready- made mechanism but you can make use of read-made gear assemblies\n" +
            "The path may be consisting of slop, surface with less friction, mud, rollers, sharp turns, tunnels, bridges etc.\n" +
            "There will be two rounds (i) Qualifying Round (ii) Final Round\n" +
            "NO modification can be made in robots after qualifying round.\n" +
            "All rights reserved by jury members & organizers.","Description :\n" + "This is technical quiz game consists of the following rounds.\n" +
            "Technical Questioning round:-\n" +
            "Any type of technical questions related to electronics and communications can be asked. The Quiz includes multiple choice question paper. For the correct answer team will be given point.\n" +
            "Buzzer Round:-\n" +
            "Like simple buzzer round, the question (Technical +General Aptitude) will be announced by the anchor. Team who press the buzzer first, will be given a chance to answer the question. For wrong answer negative points will be given. For right answer team is awarded with points.\n" +
            "Circuit Making Round:-\n" +
            "Students will be given design of a circuit; they have to identify a circuit and make it on board with a proper output result with specific time. The fastest team can earn more points." + "Rules : \n" + "Students can participate in a team of two.\n" +
            "Students will only be allowed to take pen and paper inside the competition hall.\n" +
            "Detail rules of competition will be announced on the spot of each round.\n" +
            "First and second rounds are for all the team to get points.\n" +
            "First four teams will be eligible for third round.\n" +
            "Earning of maximum points will win the quiz.","Mind Maze is the brain challenges to compete the participants with present descision making, towards logical reasoning, aptitude and analysis performances.\n" +
            "\n" +
            "Rules :\n" +
            "\n" +
            "This is an individual event.\n" +
            "Participants cannot use calculator or any electronic gadgets during the event.\n" +
            "It includes technical and non-technical problems.\n" +
            "Students from any stream can participate in this event.","Rays of hope is about steps towards hope. It's about redirecting rays of light. Use your brain to hit the target with the use of beam.\n" +
            "\n" +
            "Rules :\n" +
            "\n" +
            "Participants from any branch in in group of two can participate in this event\n" +
            "Participants must not possess any mirror or any other reflection friendly smooth materials during the event.\n" +
            "No use of internet is allowed during the event.\n" +
            "Decision taken by jury will be considered as final.\n" +
            "No material except pen or pencil is needed from participant during event.","It is all about survival, when two brained machines come on the same platform.The theory for winning remains unchanged.The one with hight power and sharp algorithm remains unbeaten.\n" +
            "\n" +
            "Rules :\n" +
            "\n" +
            "Robo with only on board batteries are permitted. No external batteries/Power supply are allowed.\n" +
            "Always use loose wire while gaming.\n" +
            "Both teams will be considered disqualified if no robo movements are found for 1 minute.\n" +
            "Decision taken by jury will be considered final.\n" +
            "Robo Malfunction:\n" +
            "3 minutes preparation time is allowed in case of non-working of robot.\n" +
            "Out of Balance-1 touch allowed.\n" +
            "Damaged robot- Disqualification.\n" +
            "All Weapons are allowed.\n" +
            "Technical Specification:\n" +
            "\n" +
            "Maximum Battery voltage capacity:12V/24V\n" +
            "Robo Size(maximum): 40cm x 30cm x 20cm\n" +
            "Weight:- With on board battery- 7Kg Max\n" +
            "Time Duration: 3 minutes\n" +
            "Play area: 7ft x 6f\n" +
            "Next","Inspired from Sir Charles Drawin Theroy of Evolution which says survival of fittest, This event is a challenged based task completion event where there will be a lot of fun with a lot of applied logical knowledge.\n" +
            "\n" +
            "Rules :\n" +
            "\n" +
            "Three Members in each group and the group will remain same till the end of competition.\n" +
            "There will be 7 stages in total.\n" +
            "No malpractices will be entertained.\n" +
            "Incompetent Teams will be elimited after each stage.","This Event allows participants to apply their knowledge into a real life structure based on the criterias given. This event requires application of most basic ideas through brain storming.\n" +
            "\n" +
            "Rules :\n" +
            "\n" +
            "Team of maximum 3 and minium 2 members.\n" +
            "Event includes 2 stages.\n" +
            "Participants have to construct structures as per given guidelines which will be provided at the time of event.\n" +
            "The Strucutre will be checked on different criterias which will be declared at the time of event.","This event give chance to participants to represent their ideas for solve real urban life problem.For most commom Problem there lies the thoughest possible solution.Participants are thereby provided a platform to represent the changes they think about when they face the similar problems in real life.\n" +
            "\n" +
            "Rules :\n" +
            "\n" +
            "One photograph of practical urban problem will be provided and a model with possible smart solutions have to be made on the spot.\n" +
            "Minimum 2 and Maximum 4 persons in each group.Use of internet is permitted.\n" +
            "Time frame of 1.5-2 hours will be provided.\n" +
            "Almost all Materials will be provided,(No Basic Stationary included)","Description : \n" + "The participants will be given random scrap material (the only inventory) out of which you have to build a working model (machine) which can perform the specified task. It's a test of your dexterity and intuitive thought process. Every team has to conceptualize, design and build a machine in limited time to compete in a specified task given to them on the spot. The event will consist of a preliminary elimination round followed by two more rounds. The competition aims to test how one quick and creative one can be at the same time and solve a problem." + "Rules : \n" + "A team may consist of maximum 4 members. Students from different institutes can form a team.\n" +
            "Every participant must get himself/herself registered before the event begins.\n" +
            "Tools and other necessary equipment like drilling machine, welding machine etc will be provided by us. Use of any parts or instruments other than provided by the organizers is prohibited.\n" +
            "Everyone has to report at the venue 30 minutes before the commencement of the preliminary elimination round.\n" +
            "No damages should be made to the equipment that are provided to participants.\n" +
            "2nd round will start soon after the 1st round result is declared.\n" +
            "Each team must formulate their own ideas and designs. Any form of plagiarism will lead to disqualification.\n" +
            "Organizers are not responsible for any loss of property, injury and delays during the event.\n" +
            "Judge's decision will be final and binding on all.\n" +
            "The team must adhere to the team spirit & accomplish a healthy competition.\n" +
            "Any negligence/fraud on the part of the participating team, once detected, will lead to immediate disqualification.\n" +
            "Organizers reserve the right to change any number of rules and the team must abide to it.\n" +
            "The model should not leave anything behind during its entire mode of operation in the arena i.e. any model disintegration in itself during its motion will be disqualified or fined according to circumstances.\n" +
            "The number of rounds and their contents are liable to change before the event and the change will be informed to all who register.","Inspire'16 presents CAD-ART, a drawing/designing event for aspiring engineers to show their excellence by making them to apply their ‘Spatial Sense’ in application based problem in Auto-CAD.\n" +
            "\n" +
            "Rules:\n" +
            "\n" +
            "This is an individual event.\n" +
            "Event is based on Auto-cad software only.\n" +
            "Every participant must get himself/herself registered before the event begins.\n" +
            "All necessary equipment will be provided by us. Use of any parts or instruments other than provided by the organizers is prohibited.\n" +
            "Judges decision will be final and binding on all.\n" +
            "Any fraud on the part of the participating team,once detected,will lead to immediate disqualification.\n" +
            "Any negligence/fraud on the part of the participating team, once detected, will lead to immediate disqualification.\n" +
            "Organizers reserve the right to change any number of rules and the team must abide to it.\n" +
            "No damages should be made to the equipment that is provided to participants.\n" +
            "The number of rounds and their contents are liable to change before the event and the change will be informed to all who register.","Let’s use water and get hydrated to propel ourselves to the top. Using water as the hydraulic fluid, you will create the required mechanism using the materials we provide that will be helpful in completing the required task!\n" +
            "\n" +
            "Rules:\n" +
            "\n" +
            "Team Of maximum 2 members. Students from different institutes can form a team.\n" +
            "Every participant must get himself/herself registered before the event begins.\n" +
            "The control of the mechanism by the participants must only by syringes.\n" +
            "Both participants are allowed during a trial.Teams will have to start from the previous checkpoint. Time will not be stopped during the positioning of the machine.\n" +
            "It is suggested that people add colors to the fluid used in tubes. This might help them while controlling the machine.\n" +
            "Mechanism should control from 1.5 meter distance at least. Mechanism should fix in 30 mm x 30 mm x 30 mm box.\n" +
            "The organizers reserve all rights to change any of the above rules as they deem fit. Change in rules, if any will be highlighted on the website.\n" +
            "In case of any discrepancy decision of the judges shall be treated as final and binding on all.","Discription : \n" + "Stretch yourself with the world of elastic city and gain some energy to be flexible. The event is based on the use of elastic energy. The participants will be provided with the required material out of which you have to make a working model which can perform the required task. This event aims to develop quick and efficient working model. Every team has to conceptualize, design and build a mechanism in limited time to compete in a specified task given to them on the spot. The event will consist of a preliminary elimination round followed by two more rounds." + "Rules : \n" + "A team may consist of maximum 2 members. Students from different institutes can form a team.\n" +
            "Every participant must get himself/herself registered before the event begins.\n" +
            "Tools and other necessary equipment like will be provided by us. Use of any parts or instruments other than provided by the organizers is prohibited.\n" +
            "Everyone has to report at the venue 30 minutes before the commencement of the preliminary elimination round.\n" +
            "No damages should be made to the equipment that is provided to participants.\n" +
            "2nd round will start soon after the 1st round result is declared.\n" +
            "Each team must formulate their own ideas and designs. Any form of plagiarism will lead to disqualification.\n" +
            "Organizers are not responsible for any loss of property, injury and delays during the event.\n" +
            "Judge's decision will be final and binding on all.\n" +
            "The team must adhere to the team spirit & accomplish a healthy competition.\n" +
            "Any negligence/fraud on the part of the participating team, once detected, will lead to immediate disqualification.\n" +
            "Organizers reserve the right to change any number of rules and the team must abide to it.\n" +
            "The model should not leave anything behind during its entire mode of operation in the arena i.e. any model disintegration in itself during its motion will be disqualified or fined according to circumstances.\n" +
            "The number of rounds and their contents are liable to change before the event and the change will be informed to all who register.","Description : \n"+"The main objective of this event is to provide corporate experience of recruitment procedure so that you can enhance your potentialities and capabilities for grabbing new opportunities.Students are expected to reach before 15minutes of stated time at predefined venue" + "Rules : \n"+ "RIPPLEHIRE\n" +
            "(MEANING OF RIPPLEHIRE: IT IS THE EVENT THAT GAMIFIES THE STUDENT REFFERAL AND ENABLES VIRTUAL RECRUITTING)\n" +
            "The main objective of this event is to provide corporate experience of recruitment procedure so that you can enhance your potential and capabilities for grabbing new opportunities.\n" +
            "Students are expected to reach before 15minutes of stated time at predefined venue.\n" +
            "Round 1:- APTITUDE\n" +
            "\uF0D8 Rules:-\n" +
            "1. There will be 40-50 questions.\n" +
            "2. The time given will be 30 minutes.\n" +
            "3. Each question will have weight age of 1 mark.\n" +
            "4. There will be no negative marking.\n" +
            "5. The paper comprises of :\n" +
            "\uF0B7 General English\n" +
            "\uF0B7 Logical Reasoning\n" +
            "\uF0B7 General Knowledge and \uF0B7 Current Affairs\n" +
            "Round 2:- DEBATUDE\n" +
            "The purpose of this round is to check how you behave, participate and contribute in a group, how much importance do you give to group objective as well as your own, how well do you listen to viewpoints of others and how open-mind are you in accepting views contrary to your own.\n" +
            "\uF0D8 Rules:-\n" +
            "There will be maximum 8 members in one group.\n" +
            "Time allotment of 5 minutes will be given after delivering the topic to be discussed.\n" +
            "Conclusion should be arrived within 10-12 minutes.\n" +
            "Slangs & abusing language is not allowed. If any critical situation arises, jury has the right to disqualify whole team.\n" +
            "Medium of expression is compulsorily “English”.\n" +
            "\uF0D8 Skills to be judged:-\n" +
            "How good you are at communication with others.\n" +
            "  1. 2. 3. 4.\n" +
            "5.\n" +
            "1.\n" +
            "2. How you behave and interact with other participants.\n" +
            "3. How expressive are you.\n" +
            "4. Your listening skills.\n" +
            "5. How you put forward your views and defend them.\n" +
            "6. Your leadership and decision-making skills.\n" +
            "7. Analyzing skills and subject knowledge.\n" +
            "8. Problem solving ability and critical thinking.\n" +
            "9. Your attitude and confidence.\n" +
            "Round 3:- ATTITUDE\n" +
            "The main objective is to build up the confidence level to face interview challenges. The interviewer will examine your educational background, your strengths and your defence. He or she is also interested in evaluating your level of motivation, ethical values, attitude and confidence which can be the important selection criterion.\n" +
            "\uF0D8 Skills to be judged:-\n" +
            "1. Confidence level and attitude\n" +
            "2. Quality of answers\n" +
            "3. Technical aspects/knowledge\n" +
            "4. Body language\n" +
            "5. Initiator or follower.\n" +
            " ","Description : \n" + "Participate in a larger than life version of one of the oldest games, by traveling through an appropriately sized map of the original Indian game of luck. Roll the colossal dice and be prepared to answer a technical, logical or general knowledge question every time you land on a snake or a ladder." + "Rules : \n" + "SNAKE AND LADDERS FORMAT\n" +
            "1. Prior registration is required.\n" +
            "2. Each game has a time limit of 20 minutes, with 4 – 5 (MAX. 8) teams playing in a\n" +
            "game.\n" +
            "3. Each team consist of two people, who will substitute the playing pieces.\n" +
            "4. Questions are asked to the participants at every snake or ladder, and the correctness of\n" +
            "the answer determines their fate.\n" +
            "5. The difficulty of the question increases as the team moves up the board.\n" +
            "SNAKES AND LADDERS – JUDGING CRITERIA\n" +
            "The game can end in two ways:\n" +
            "1. A team reaches the end of the board and is declared a winner.\n" +
            "2. The time limit of 20 minutes is reached. In this case, the team that has progressed the\n" +
            "furthest is declared the winner.\n" +
            "SNAKE AND LADDERS – RULES\n" +
            "1. When a team lands on a snake, a question will be asked to the participant. An incorrect answer would mean that the team follows the snake down.\n" +
            "2. When a team lands on a ladder, a question will be asked to the participant and is required to answer the question correctly to move up the ladder.\n" +
            "3. Each question has a time limit of 20 seconds, after which an unanswered question is declared incorrect.\n" +
            "4. Event manager’s decision is final.", "Description : \n" + "The main objective of this event is to make student intellegent to play mind game and to increase the general knowledge by making them to find the treasure by giving them hints and clues." + "Rules : \n" + "\uF0D8 Each team consists of maximum 4 participants.\n" +
            "\uF0D8 The game is divided in 3 levels.\n" +
            "1. Level: Silver Push (Television Quiz):\n" +
            "\uF0B7 Each team would be given a set of question paper consisting 40 objective type questions\n" +
            "\uF0B7 Time limit is 15 minutes.\n" +
            "\uF0B7 In case of tie, 3 additional questions will be asked orally which will be\n" +
            "required to be answered within 20 sec and the team answering maximum\n" +
            "questions in minimum time will be considered winner.\n" +
            "\uF0B7 The questions asked will be pertaining to those that are televise.\n" +
            "2. Level: Earth Hacker (Virtual Treasure Hunt):\n" +
            "\uF0B7 Teams selected in the 1st round will compete against each other in a PC\n" +
            "based treasure hunt game.\n" +
            "\uF0B7 The team that completes the virtual treasure hunt in the minimum of time\n" +
            "will proceed to level 3.\n" +
            "Note: No. of teams selected in 3rd level will depend on the no. of participating students.\n" +
            "3. Level: Fear – Files (Physical Struggle):\n" +
            "\uF0B7 The team have to pass through difficulties, hurdles, physical activities\n" +
            "while solving clues and maintaining the team co-ordination.\n" +
            "\uF0B7 The team that completes the entire track in the minimum of time will be\n" +
            "declared the winner.","Description : \n" + "This is basically a game where a team consisting of two players will be participating. Here, each team will be given 10 crores of virtual money.\n" +
            "\n" +
            "Now, one by one different cricket players will be displayed on the screen. From the displayed players, each team has to buy a batsman, a bowler and a wicket-keeper from the virtual money provided. So basically, each team has to buy three players." + "Rules : \n" + "\n" +
            "\uF0D8 This is basically a game where a team consisting of two players will be participating.\n" +
            "\uF0D8 Here, each team will be given 10 crores of virtual money.\n" +
            "\uF0D8 Now, one by one different cricket players will be displayed on the screen. From the\n" +
            "displayed players, each team has to buy a batsman, a bowler and a wicket-keeper from\n" +
            "the virtual money provided. So basically, each team has to buy three players.\n" +
            "\uF0D8 Now, the total amount spent by each team on buying these players should be within the\n" +
            "limit of virtual money i.e, 10 crores. All the teams will be told about this rule at the start of the game. If they exceed the limit while buying, bidding or at the end, the particular will be automatically disqualified.\n" +
            "\uF0D8 In the bidding of a particular player, the increment in the bidding will be: 1) 5lakhsupto1crore.\n" +
            "2) 10lakhsfrom1croreto5crores. 3) 25lakhsfrom5croresonwards.\n" +
            "\uF0D8 According to the number of entries, the auction will be played in three sets.\n" +
            "\uF0D8 From the first set of teams, the top two teams will be selected for the final round.\n" +
            "\uF0D8 From the second set of teams, the top two teams will be selected for the final round.\n" +
            "\uF0D8 From the third set of teams, the top two teams will be selected for the final round.\n" +
            "\uF0D8 The selection criteria for the top two teams from each set will be decided on the basis\n" +
            "of the maximum points gained by the teams and the points will be based upon the\n" +
            "ratings of the players decided by us which wont be disclosed to the participants.\n" +
            "\uF0D8 In case of a tie between two teams or more, the priority will be given to the team that\n" +
            "has the maximum rating of the batsman bought by the particular team.\n" +
            "FINAL ROUND:\n" +
            "\uF0D8 The final round will be played on the next day.\n" +
            "\uF0D8 The selected six teams will be playing for the final round.\n" +
            "\uF0D8 In this final round, each team has to buy 5 players consisting of 2 batsmen, 2 bowlers\n" +
            "and a wicket-keeper.\n" +
            "\uF0D8 For buying these players, each team will be given a virtual money of 20 crores.\n" +
            "\uF0D8 Winners:\n" +
            "\uF0D8 The top 2 teams with the maximum points will be declared as the winners.","Rules :\n" +
            "\n" +
            "Five images are allowed per person.\n" +
            "Theme: nature, landscape, shutter priority, street.\n" +
            "Send soft copy at email: ckpcetphoto@gmail.com\n" +
            "Minimum image size must be 500 kb.\n" +
            "Last date of submission is 10th march 2016.\n" +
            "Selected persons will get response by mail/phone number.\n" +
            "Printed copies (A3 size) of images will be collected before 15th march 2016.\n" +
            "There is no participation cost","Rules :\n" +
            "\n" +
            "Prior registration required.(Registration fees: \u20B9100 per person)\n" +
            "Individual event\n" +
            "Theme will be declared on the spot.\n" +
            "Three images per theme required.(each image with original shot and processed image)","Paper Presentation is the event where young, inquisitive and confident minds express their technical geniuses. This event boosts up the confidence level, improves communication skills and propels reading habits and research work and thus grooms their own personality.\n" +
            "Note:* Abstract file must be submitted in this format : TITLE: YOURNAME_DEPARTMENTNAME\n" +
            "\n" +
            "Department Wise Rules\n" +
            "\n" + "Computer : \n" + "1. Two members in a group.\n" +
            "2. Any topic related to computer branch\n" +
            "3. 10 minutes for paper presentation (PowerPoint presentation).\n" +
            "4. Submit abstract for paper before 15th March (email:mayank12jari@gmail.com).\n" +
            "FORMAT for preparing & submitting paper:\n" +
            "\uF0B7 Page Size: A4\n" +
            "\uF0B7 Font Size:\n" +
            "\uF0A7 Paper Title: 16 Times New Roman Bold centered \uF0A7 Heading1: 14 Times New Roman Bold centered \uF0A7 Heading2: 12 Times New Roman Bold\n" +
            "\uF0A7 Content: 12 Times New Roman Justified\n" +
            "\uF0B7 Line Spacing: single\n" +
            "\uF0B7 Margins: Left 1.25\", Right 1.0\", Top & Bottom 1.0\"\n" +
            "\uF0B7 No. of Pages: Max 15 Pages (Including Title, Index etc), One Side printing,\n" +
            "\uF0B7 Numbering on all pages (center & bottom of the page)\n" +
            "\uF0B7 Format of paper\n" +
            "\uF0A7 Title page.\n" +
            "\uF0A7 Abstract (of 100-150 words)\n" +
            "\uF0A7 Index with page number\n" +
            "\uF0A7 List of Figures\n" +
            "\uF0A7 List of Tables (if any)\n" +
            "\uF0A7 Topic description.\n" +
            "\uF0A7 Conclusion/Summary\n" +
            "\uF0A7 Bibliography / References (As per IEEE standard Format)" + "Electronics And Communications: \n" + "\n" +
            "Event Description\n" +
            "\uF0B7 Paper Presentation is the event where young, inquisitive and confident minds express their technical geniuses.\n" +
            "\uF0B7 This event boosts up the confidence level, improves communication skills and propels reading habits and research work and thus grooms their own personality.\n" +
            "Rules & Regulations\n" +
            "\uF0B7 Maximum two students per group.\n" +
            "\uF0B7 Presentation Format must be in PowerPoint.\n" +
            "\uF0B7 Presentation time is 10 min.\n" +
            "\uF0B7 Candidates have to submit.\n" +
            "a)One hard copy (At the time of presentation)\n" +
            "b)Abstract (E-mail)\n" +
            "\uF0B7 Email:\n" +
            "1) sandeep_kumbhani@yahoo.com 2) shivangdesai010@gmail.com\n" +
            "FORMAT for preparing & submitting paper:\n" +
            "\uF0B7 Page Size: A4\n" +
            "\uF0B7 Font Size:\n" +
            "\uF0A7 Paper Title: 16 Times New Roman Bold centered \uF0A7 Heading1: 14 Times New Roman Bold centered \uF0A7 Heading2: 12 Times New Roman Bold\n" +
            "\uF0A7 Content: 12 Times New Roman Justified\n" +
            "\uF0B7 Line Spacing: single\n" +
            "\uF0B7 Margins: Left 1.25\", Right 1.0\", Top & Bottom 1.0\"\n" +
            "\uF0B7 No. of Pages: Max 15 Pages (Including Title, Index etc), One Side printing,\n" +
            "\uF0B7 Numbering on all pages (center & bottom of the page)\n" +
            "\uF0B7 Format of paper\n" +
            "\uF0A7 Title page.\n" +
            "\uF0A7 Abstract (of 100-150 words)\n" +
            "\uF0A7 Index with page number\n" +
            "\uF0A7 List of Figures\n" +
            "\uF0A7 List of Tables (if any)\n" +
            "\uF0A7 Topic description.\n" +
            "\uF0A7 Conclusion/Summary\n" +
            "\uF0A7 Bibliography / References(As per IEEE standard Format)\n" +
            "    \n" +
            "Suggested Topics\n" +
            "\uF0B7 VLSI\n" +
            "\uF0B7 Image Processing\n" +
            "\uF0B7 Embedded System\n" +
            "\uF0B7 Digital Signal Processing\n" +
            "\uF0B7 Mobile Communication\n" +
            "\uF0B7 Digital Broadcasting\n" +
            "\uF0B7 Radar Security\n" +
            "\uF0B7 Data Processing\n" +
            "\uF0B7 Internet Systems, Services & Standards\n" +
            "\uF0B7 Network Security\n" +
            "\uF0B7 Protocols & Routing\n" +
            "\uF0B7 Wireless Ad-hoc Sensors\n" +
            "\uF0B7 Bluetooth\n" +
            "\uF0B7 Robotics & System Automation\n" +
            "\uF0B7 Telemetry\n" +
            "\uF0B7 Remote Sensing & Control\n" +
            "\uF0B7 Instrumentation\n" +
            "\uF0B7 Industrial & Medical Application\n" +
            "\uF0B7 Speech & Audio Processing\n" +
            "Evaluation Criteria\n" +
            "\uF0B7 Based on technical level and presentation .\n" +
            " " + "Electrical : \n" + "\n" +
            "1. Any paper related to the emerging topic of Electrical stream is allowed. Number of participants per paper is limited to two.\n" +
            "2. The copy of the paper must be in pdf.\n" +
            "3. Hard and soft copy of paper must be submitted before presentation.\n" +
            "4. Presentation must be prepared in Power point. The time allowed for presentation is 10\n" +
            "minutes.\n" +
            "5. Abstract must be limited to 500 words and it must give the brief idea about content of\n" +
            "paper.\n" +
            "6. Title of the paper must be in Times New Roman, Bold, font size 14 and single line\n" +
            "spacing. Entire paper must be in Times New Roman, font size 12 and single line\n" +
            "spacing.\n" +
            "7. No. of pages of paper must be limited to 4.\n" +
            "8. Submit abstract for paper before 15th March (Email: milind.trivedi@ckpcet.ac.in)\n" +
            "  " + "Civil : \n" + "1. Two members in a group.\n" +
            "2. Each group will be given 10 minutes to prersent the paper with further 5 minutes for\n" +
            "Q & A.\n" +
            "3. Any topic related to civil engineering can be taken.\n" +
            "4. Paper presentation prior to presentation is mandatory.\n" +
            "5. You can also mail you paper to the email bharukapalash409@gmail.com.\n" +
            "6. Last date of submission of paper 15/3/2016.\n" +
            "7. There will be a panel of judges and the decision of judges will be final and would not\n" +
            "be challenged.\n" +
            "  " + "Mechanical : \n" + "Technical-Paper would be made by the students on their respective subject before the event date and they just would have to present.\n" +
            "Rules and Regulations:\n" +
            " ","Posters are a key component of communicating an important technology element/idea/project in a successful engineering career. It combines text and graphics for presentation which is visually interesting and accessible. It allows you to display your work to a large group of other people and to talk to and receive feedback from interested viewers.\n" +
            "Note:* Abstract file must be submitted in this format : TITLE: YOURNAME_DEPARTMENTNAME\n" +
            "\n" +
            "Department Wise Rules\n" +
            "\n" + "Computer : \n" + "1. Two members in a group.\n" +
            "2. Any topic related to computer branch.\n" +
            "3. The poster should be designed on the A1 size sheet and should be unfolded.\n" +
            "4. 10 minutes for poster presentation." + "Civil : \n" + "1. The poster should be designed on the A1 size sheet and should be unfolded.\n" +
            "2. There may be no materials placed in front of, above, below or to the side of the poster.\n" +
            "3. No printed poster is allowed.\n" +
            "4. Two members in a group.\n" +
            "5. The total time duration for explaining the poster will be 15 mins (10 min for\n" +
            "explanation + 5 min for question answer)\n" +
            "6. There will be a panel of judges and the decision of judges will be final and would not\n" +
            "be challenged.", "As it goes \"ACTIONS SPEAK LOUDER THAN WORDS.\" Hence the scientific knowledge is put into practice to show its immense strength and potential to the world.This event includes demonstration of working models, wherein students are expected to come up with innovative ideas with proper technical explanation.\n" +
            "Note:* Abstract file must be submitted in this format : TITLE: YOURNAME_DEPARTMENTNAME\n" +
            "\n" +
            "Department Wise Rules\n" + "Computer : \n" + "1. Four members in a group.\n" +
            "2. Any topic related to computer branch.\n" +
            "3. Submit abstract for the model before 15th March. (email:mayank12jari@gmail.com)\n" +
            "4. If possible prepare and submit a brief report based on their model.\n" +
            "FORMAT for preparing & submitting paper:\n" +
            "\uF0B7 Page Size: A4\n" +
            "\uF0B7 Font Size:\n" +
            "\uF0A7 Paper Title: 16 Times New Roman Bold centered \uF0A7 Heading1: 14 Times New Roman Bold centered \uF0A7 Heading2: 12 Times New Roman Bold\n" +
            "\uF0A7 Content: 12 Times New Roman Justified\n" +
            "\uF0B7 Line Spacing: single\n" +
            "\uF0B7 Margins: Left 1.25\", Right 1.0\", Top & Bottom 1.0\"\n" +
            "\uF0B7 No. of Pages: Max 15 Pages (Including Title, Index etc), One Side printing,\n" +
            "\uF0B7 Numbering on all pages (center & bottom of the page)\n" +
            "\uF0B7 Format of paper\n" +
            "\uF0A7 Titlepage.\n" +
            "\uF0A7 Abstract (of 100-150 words)\n" +
            "\uF0A7 Index with page number\n" +
            "\uF0A7 List of Figures\n" +
            "\uF0A7 List of Tables (if any)\n" +
            "\uF0A7 Topic description.\n" +
            "\uF0A7 Conclusion/Summary\n" +
            "\uF0A7 Bibliography / References (As per IEEE standard Format)\n" + "Electronics And Communications : \n" + "\uF0B7 Max. 4 Students per group can participate.\n" +
            "\uF0B7 Each group has to submit Abstract of the project before date\n" +
            "With subject model abstract.\n" +
            "\uF0B7 The entry should meet the following specifications\n" +
            "\uF0A7 Max.No.of pages : 3 including block diagram \uF0A7 Paper size : A4\n" +
            "\uF0A7 Printing : Single side- two column printing\n" +
            "\uF0A7 Line spacing : Single\n" +
            "\uF0A7 Font : \"Times New Roman\"\n" +
            "\uF0A7 Font Size : Title - 16, Sub title - 14 and Content : 12\n" +
            "through e-mail:\n" +
            "\uF0B7 220 V AC supply points will be provided.\n" +
            "\uF0B7 Specify the requirement of specific software/hardware, number and types of power\n" +
            "supplies etc. in or any other specialized component for your model presentation well\n" +
            "advance in abstract.\n" +
            "\uF0B7 Banner/Display Material: White-Sheets should be used to display the block diagram of relevant set up of the model.\n" +
            "\uF0B7 Models have to be displayed for two days during event and participants have to be present for their demonstration during those timings\n" +
            "\uF0B7 Email:\n" +
            "1) sandeep_kumbhani@yahoo.com 2) shivangdesai010@gmail.com\n" +
            "Evaluation Criteria\n" +
            "\uF0B7 Usefulness, working, rolls of innovation project and implementation level.\n" + "Electrical : \n" + "1. Maximum numbers of members are limited to four.\n" +
            "2. Working/non-working model from the various areas of Electrical discipline are\n" +
            "allowed. Innovative ideas are invited.\n" + "Mechanical : \n" + "\n" +
            "\uF0B7 Maximum two students can participate per model.\n" +
            "\uF0B7 After registering for the event, the organizers decision will be final and binding.\n" +
            "\uF0B7 Topic of the model presentation would be mechanical engineering related.\n" +
            "\uF0B7 Model should be live demo; software animation or video demonstration of model is not\n" +
            "allowed.\n" +
            "\uF0B7 The organizers reserve the right to modify the rules of the contest at any point of time and\n" +
            "will do their best to inform to participants of the same.\n" +
            "\uF0B7 All Expenses related to the model is covered by participants only.\n" +
            "\uF0B7 Decision of the jury would be final and inevitable.\n" +
            " \n" +
            "Model would be made by the students before the event date and they just would have to present their creation.\n" +
            "Rules and Regulations:\n" + "Civil : \n" + "1. Four members in each group.\n" +
            "2. Model/project is not necessary to be in live demonstration.\n" +
            "3. All contestants are expected to orally explain their model.\n" +
            "4. If possible participants can also submit a brief report based on their model which can\n" +
            "help them score extra points.\n" +
            "5. The topic of the model will be of the participant’s choice related to civil engineering.\n" +
            "6. There will be a panel of judges and the decision of judges will be final and would not\n" +
            "be challenged.","Topics\n" +
            "\n" +
            "Social Issues Related to Gender.\n" +
            "Woman Empowerment\n" +
            "Effect of orthodox custom.\n" +
            "Indian Youth.\n" +
            "Rules\n" +
            "\n" +
            "75cm x 60cm should be the size of poster.\n" +
            "Participant can use anything to make poster better.\n" +
            "Participant have to give their poster to volunteer on or before 14th march.\n" +
            "participant will get point for participation."};
    String[] values = new String[]{"Message1", "PRIYAL Message2", "Message3"};
    int position =0;
    int fin_pos=0;
    /*Integer[] images = new Integer[]{R.drawable.algoholics,R.drawable.javajig,R.drawable.backgear,R.drawable.codester,R.drawable.linux,R.drawable.mind_the_line,
    R.drawable.robohustle,R.drawable.roborace,R.drawable.col,R.drawable.crusade,R.drawable.geekwars};

    String[] event_name = new String[]{"ALGOHOLICS","JAVA JIG","CODESTER","BACK GEAR","LINUX COMMAND NINJA","MIND THE LINE","ROBO-HUSTLE","ROBO-RACE","CLASH-ON-LAN","CRUSADE","GEEK WARS"};
    String[] event_desc = new String[]{"We are obsessed with solutions to all our problems. But we know that a problem may have\n" +
            "any number of solutions. To find out the least complex path to our solutions we bring you\n" +
            "algoholics. Write the best pseudo code and prove your mettle.","JAVA is a necessity in today’s world. Since its inception in the days when it was ‘oak’, JAVA’s\n" +
            "contributions have been innumerable. Called the most robust programming language, the\n" +
            "JAVA JIG tests your proficiency in this language. It will test how well you know the nuances\n" +
            "of JAVA as well as your skills as a coder.","To challenge your very basic understanding of object oriented programming, we bring to you\n" +
            "the C++ code jam. Here we check not only your problem solving skills, but also your grasp\n" +
            "over this fascinating language.","This contest will challenge the conventional norms of programming where in a programmer\n" +
            "generates output from the code. Here, we present the competitors with the output and the\n" +
            "programmers are required to apply their reverse engineering skills to generate the code that\n" +
            "gives this output.",">Linux was a work of genius. An operating system that was free. Not only that, you could\n" +
            "contribute in making it better. This gave birth to a community formed of programmers with\n" +
            "great skill. To salute this phenomena of open source technology, we bring to you the LINUX\n" +
            "COMMAND NINJA. Show the world how well you know the linux command line and how can\n" +
            "you contribute to this dynamic technology.","Linux was a work of genius. An operating system that was free. Not only that, you could\n" +
            "contribute in making it better. This gave birth to a community formed of programmers with\n" +
            "great skill. To salute this phenomena of open source technology, we bring to you the LINUX\n" +
            "COMMAND NINJA. Show the world how well you know the linux command line and how can\n" +
            "you contribute to this dynamic technology.","Follow the path to success by designing an efficient line following robot. The event\n" +
            "comprises of a track laid in black strip on white sheet, having a starting and finishing line with\n" +
            "some intermediate checkpoints.","This event will have two teams competing against each other. There will be different balls in\n" +
            "the arena, which will have a hole in the center. Each ball will have some points. Participants\n" +
            "will try to get as many balls as they can, using their robots while their opponents try the same.\n" +
            "Teams can drop their opponents’ balls in the hole in order to prevent them from scoring those\n" +
            "points. The competitors can also knock out their opponents by knocking them into the hole\n" +
            "twice.","This event is a hurdle race designed for robots. Teams will compete against each other while\n" +
            "racing their robots on a track with hurdles. The winning team will be the one whose robot\n" +
            "crosses the hurdles and finishes the race in minimum time. Penalty time will be added to the\n" +
            "total time in case a hurdle is skipped or the robot touches the boundary.","Get ready for an adrenaline rush and a test of your senses. Compete against participants of\n" +
            "different colleges to triumph as the best LAN gaming team. We have for you, first person\n" +
            "shooters, races and what not. So get ready to enter a world of virtual reality, and prove\n" +
            "yourself the best.","The box of miracles and secrets is waiting for you. Come and explore a whole new world\n" +
            "within. Experience fun, like you have never before. Apply your brain in every technical aspect\n" +
            "and hunt for the treasure.","Arguments are naturally constructive. They lead to a mind open to new ideas. In a field as\n" +
            "dynamic as technology, we need to argue to keep ourselves on our toes and constantly\n" +
            "updated. Thus, all our welcome to the technical debate."};
*/
    //String[] list = {"Competition 1","Competition 2"};
    private List<Event> t_events ;

    public FragmentA() {

        this.position = position;
        //this.fin_pos= position;
        //this.position = getArguments().getInt("pos");
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //tv = (TextView)getView().findViewById(R.id.textView);
        //lv = (ListView)getActivity().findViewById(R.id.listView);
        //lv.setAdapter(new ArrayAdapter<String>(this,
        //      android.R.layout.simple_list_item_1, list);

        View rootView = inflater.inflate(R.layout.fragment_a, container, false);
        this.v = rootView;
        int temp_pos = getArguments().getInt("bpos");

        Log.d(FragmentA.class.getName(), "temp_pos is : " + temp_pos);

        position = fin_pos = temp_pos;

        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
        // android.R.layout.simple_list_item_1, values);


        //populateListView();

        //setListAdapter(adapter);


        return rootView;

    }
    @Override
    public void onResume() {
        super.onResume();
        t_events = new ArrayList<Event>();

        Log.d("Priyal", "position : " + position);

        populateEventList();
        final ArrayAdapter<Event> adapter = new MyListAdapter(getActivity().getBaseContext(), values);
        ((ListView)v.findViewById(R.id.list)).setAdapter(adapter);
        ((ListView)v.findViewById(R.id.list)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(getActivity().getBaseContext(),Event_DESC_final.class);
                int num=0;
                switch (pane){
                    case 0:
                        i.putExtra("pos",position); // 0, 1, 2, 3
                        break;
                    case 1:
                        fin_pos = 4 + position; // 4, 5, 6, 7
                        i.putExtra("pos",fin_pos);
                        break;
                    case 2:
                        fin_pos = 8 + position; // 8, 9, 10
                        i.putExtra("pos",fin_pos);
                        break;

                    case 3:
                        fin_pos = 11 + position;
                        i.putExtra("pos",fin_pos);
                        break;
                    case 4:
                        fin_pos = 14 + position;
                        i.putExtra("pos",fin_pos);
                        break;
                    case 5:
                        fin_pos = 18 + position;
                        i.putExtra("pos",fin_pos);
                        break;
                    case 6:
                        fin_pos = 22 + position;
                        i.putExtra("pos",fin_pos);
                        break;
                    case 7:
                        fin_pos = 24 + position;
                        i.putExtra("pos",fin_pos);
                        break;
                }
                //i.putExtra("pos",fin_pos);
                i.putExtra("pane",pane);
                //Toast.makeText(getActivity().getBaseContext(),"Pane: "+pane+"Position: "+position,Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

    }

    public void populateEventList() {
            switch (position)
            {
                case 0:
                    pane =0;
                    t_events.add(new Event(event_name[0],images[0],event_desc[0], "Programming",dates[0]));
                    t_events.add(new Event(event_name[1],images[1],event_desc[1], "Programming",dates[1]));
                    t_events.add(new Event(event_name[2],images[2],event_desc[2], "Programming",dates[2]));
                    t_events.add(new Event(event_name[3],images[3],event_desc[3], "LAN Gaming",dates[3]));

                    break;
                case 1:
                    pane =1;
                    t_events.add(new Event(event_name[4],images[4],event_desc[4], "E & C",dates[4]));
                    t_events.add(new Event(event_name[5],images[5],event_desc[5], "E & C",dates[5]));
                    t_events.add(new Event(event_name[6],images[6],event_desc[6], "E & C",dates[6]));
                    t_events.add(new Event(event_name[7],images[7],event_desc[7], "E & C",dates[7]));
                    break;
                case 2:
                    pane =2;
                    t_events.add(new Event(event_name[8],images[8],event_desc[8], "Electrical",dates[8]));
                    t_events.add(new Event(event_name[9],images[9],event_desc[9], "Electrical",dates[9]));
                    t_events.add(new Event(event_name[10],images[10],event_desc[10], "Electrical",dates[10]));
                    break;
                case 3:
                    pane =3;
                    t_events.add(new Event(event_name[11],images[11],event_desc[11], "Civil",dates[11]));
                    t_events.add(new Event(event_name[12],images[12],event_desc[12], "Civil",dates[12]));
                    t_events.add(new Event(event_name[13],images[13],event_desc[13], "Civil",dates[13]));
                    break;
                case 4:
                    pane =4;
                    t_events.add(new Event(event_name[14],images[14],event_desc[14], "Mechanical",dates[14]));
                    t_events.add(new Event(event_name[15],images[15],event_desc[15], "Mechanical",dates[15]));
                    t_events.add(new Event(event_name[16],images[16],event_desc[16], "Mechanical",dates[16]));
                    t_events.add(new Event(event_name[17],images[17],event_desc[17], "Mechanical",dates[17]));
                    break;
                case 5:
                    pane =5;
                    t_events.add(new Event(event_name[18],images[18],event_desc[18], "Applied Science",dates[18]));
                    t_events.add(new Event(event_name[19],images[19],event_desc[19], "Applied Science",dates[19]));
                    t_events.add(new Event(event_name[20],images[20],event_desc[20], "Applied Science",dates[20]));
                    t_events.add(new Event(event_name[21],images[21],event_desc[21], "Applied Science",dates[21]));
                    break;
                case 6:
                    pane = 6;
                    t_events.add(new Event(event_name[22],images[22],event_desc[22], "Photography",dates[22]));
                    t_events.add(new Event(event_name[23],images[23],event_desc[23], "Photography",dates[23]));
                    break;
                case 7:
                    pane =7;
                    t_events.add(new Event(event_name[24],images[24],event_desc[24], "Presentation",dates[24]));
                    t_events.add(new Event(event_name[25],images[25],event_desc[25], "Presentation",dates[25]));
                    t_events.add(new Event(event_name[26],images[26],event_desc[26], "Presentation",dates[26]));
                    t_events.add(new Event(event_name[27],images[27],event_desc[27], "Presentation",dates[27]));
                    break;
            }




    }

    public void populateListView() {
        //We're going to use an arrayadapter...An arrayadapter for Car class


    }

    static class ViewHolder{
        ImageView imageView;
        TextView event_name_Text;
        TextView event_date;
        TextView event_category;
        TextView event_dedc_Text;

    }

    private class MyListAdapter extends ArrayAdapter<Event> {
        private final Context context;
        private final String[] values;
        //getView function is going to be implemented/overridden here..
        //Alt+Shift+S
        private int lastPosition = -1;
        public MyListAdapter(Context context, String[] values) {
            super(context, R.layout.item_views_list, t_events);
            this.values = values;
            this.context = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with(may have been given null)

            final ViewHolder holder;
            View itemView = convertView;
            if (itemView == null) {
                itemView = getActivity().getLayoutInflater().inflate(R.layout.item_views_list, parent, false);
                holder = new ViewHolder();

                holder.imageView = (ImageView) itemView.findViewById(R.id.imgview);
                holder.event_name_Text = (TextView) itemView.findViewById(R.id.evntname);
               holder.event_date = (TextView)itemView.findViewById(R.id.date);
                holder.event_category = (TextView)itemView.findViewById(R.id.category);
                holder.event_dedc_Text = (TextView) itemView.findViewById(R.id.evntdesc);
                itemView.setTag(holder);
            }else {

                holder = (ViewHolder)itemView.getTag();
            }
            //Find the car to work with.

            final Event currentevent = t_events.get(position);
            //Fill the View


                   holder.imageView.setImageResource(currentevent.getImage_id());
            holder.event_date.setText(currentevent.getDate().toString());


//            holder.imageView.setImageResource(currentevent.getImage_id());
            holder.imageView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    Toast.makeText(getActivity(), "Event of " + currentevent.getEvent_name() + " Clicked", Toast.LENGTH_SHORT).show();

                }
            });
            //Make

            holder.event_name_Text.setText(currentevent.getEvent_name());


            holder.event_date.setText(currentevent.getDate());

            //TextView event_category = (TextView)itemView.findViewById(R.id.category);
            holder.event_category.setText(currentevent.getCategory());
            //Year
            //TextView event_dedc_Text = (TextView) itemView.findViewById(R.id.evntdesc);
            holder.event_dedc_Text.setText(currentevent.getEvent_desc());

            /*//Condition
            TextView conditionText = (TextView)itemView.findViewById(R.id.item_txtCondition);
            conditionText.setText(currentCar.getCondition());*/
            /*Animation animation = AnimationUtils.loadAnimation(getContext(), (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
            itemView.startAnimation(animation);
            lastPosition = position;*/
            return itemView;

            //return super.getView(position, convertView, parent);
        }
    }

    class MyTask extends AsyncTask<Void,Void,Void>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected Void doInBackground(Void... params) {
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }
    }

}



