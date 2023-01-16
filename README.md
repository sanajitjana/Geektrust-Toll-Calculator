<a name="readme-top"></a>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/sanajitjana/Geektrust-Toll-Calculator">
    <img src="https://user-images.githubusercontent.com/76105799/212701060-aa4dca7e-23e0-4595-b543-a0d8e43fec26.png" alt="Logo" width="80" height="80">
  </a>

  <h1 align="center">Toll Calculator</h1>

  <p align="center">
    The app where we calculate the money collection via toll from travelers as per vehicle type and their return journey.
    <br />
    <a href=""><strong></strong></a>
    <br />
    <br />
    <a href="https://www.geektrust.com/challenge/toll-calculator">View Question</a>
    ·
    <a href="https://github.com/sanajitjana/Geektrust-Toll-Calculator/issues">Report Bug</a>
    ·
    <a href="https://github.com/sanajitjana/Geektrust-Toll-Calculator/issues">Request Feature</a>
  </p>
</div>

![Score](https://user-images.githubusercontent.com/76105799/212702921-8d070a00-49ac-4fd8-bd4d-6c0823016093.jpg)

<!-- ABOUT THE PROJECT -->

## About The Project

### Context

 A new road has been built and is now open for general traffic. The road construction company needs your help in calculating the money collection via toll from travellers. 
 
 ### FASTAG
 
 The construction company prefers money to be collected via FASTAG. FASTAG is an electronic payment utility that can be used to pay tolls.  All vehicles have a vehicle number. The FASTAG is associated with a vehicle number.
 If there is no sufficient balance in the FASTAG, then the remaining cost of the toll needs to be paid by cash. If travellers do not have a FASTAG they can make the payment by Cash. There is a flat fee of 40 for such cash transactions.


### Toll charges

 Amount of toll collected varies based on the weight of the vehicle.
 
 ![image](https://user-images.githubusercontent.com/76105799/212706250-d1d8fae5-053c-40ff-88ce-bcdd4858044b.png)

 
 ### Journey Type
 
 Toll charges are different for a single trip and for a return journey. When a vehicle does a return journey, there is a discount of 50% for the return journey.
For eg: If a Van passes through the toll first time, the toll collected is 100. If the same Van passes again through the toll, the amount collected for the return journey is 50. If the Van passes a third time, it will be treated as a new single journey and the toll collected is 100. 
 
 
 ### Goal
 Your task is to build a solution that calculates various tolls collected and print the payment summary and vehicle type summary.
 
 - The payment summary should give a breakup of the total amount collected and the total discount given. 
 - The vehicle type summary should display the total number of vehicles passed per type in descending order of the collection amount.
 
### Assumptions

 - All vehicles passing through has a vehicle number. 
 - Some vehicles may not have FASTAG, in that case the toll amount is paid by cash. 
 - Some vehicles that have FASTAG may not have sufficient money to pay the toll, then the remaining amount is paid by cash. 
 - Tolls are always collected from FASTAG first, then only cash is taken if needed. 
 - Every cash transaction has a flat fee of 40. 
 - Cash amount collected includes the toll charges paid and the flat fee of 40. 
 - The vehicle count is calculated based on journeys. eg: if the same car passes twice, the count is 2.

### Sample Input/Output 1

![image](https://user-images.githubusercontent.com/76105799/212706747-99bd47c4-8c3a-4ff8-8223-4ef3453ac090.png)

### Explanation

![image](https://user-images.githubusercontent.com/76105799/212706836-046df108-e61b-4d43-9177-baa01973de20.png)


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- LICENSE -->

## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->

[contributors-shield]: https://img.shields.io/github/contributors/sanajitjana/Geektrust-Toll-Calculator.svg?style=for-the-badge
[contributors-url]: https://github.com/sanajitjana/Geektrust-Toll-Calculator/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/sanajitjana/Geektrust-Toll-Calculator.svg?style=for-the-badge
[forks-url]: https://github.com/sanajitjana/Geektrust-Toll-Calculator/network/members
[stars-shield]: https://img.shields.io/github/stars/sanajitjana/Geektrust-Toll-Calculator.svg?style=for-the-badge
[stars-url]: https://github.com/sanajitjana/Geektrust-Toll-Calculator/stargazers
[issues-shield]: https://img.shields.io/github/issues/sanajitjana/Geektrust-Toll-Calculator.svg?style=for-the-badge
[issues-url]: https://github.com/sanajitjana/Geektrust-Toll-Calculator/issues
[license-shield]: https://img.shields.io/github/license/sanajitjana/Geektrust-Toll-Calculator.svg?style=for-the-badge
[license-url]: https://github.com/sanajitjana/Geektrust-Toll-Calculator/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/sanajitjana
[next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[next-url]: https://nextjs.org/
[react.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[react-url]: https://reactjs.org/
[vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[vue-url]: https://vuejs.org/
[angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[angular-url]: https://angular.io/
[svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[svelte-url]: https://svelte.dev/
[laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[laravel-url]: https://laravel.com
[bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[bootstrap-url]: https://getbootstrap.com
[jquery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
