import React, { Fragment } from 'react';
import logo from './logo.svg';
import './App.css';

import GreetWithName from './components/Greet'
import Welcome from './components/Welcome'
import Message from './components/Message'
import Counter from './components/Counter'
import FuctionClick from './components/FunctionClick'
import ClassClick from './components/ClassClick'
import EventBind from './components/EventBind'
import ParentComponent from './components/ParentComponent'
import UserGreeting from './components/UserGreeting'
import NameList from './components/NameList'
import StyleSheet from './components/StyleSheet'
import styles from './userStyle.module.css'
import './userStyle.css'
import Form from './components/Form'
import LifeCycleA from './components/LifeCycleA'
import FragmentDemo from './components/FragmentDemo'
import Table from './components/Table';
import Clock from './components/Clock';
import CountdownClock from './components/CountdownClock';


function App() {
  return (
    <div className="App">
      {/* <Greet /> */}
      {/* <Welcome /> */}
      
      {/* 
      <GreetWithName name="MJ" profession="Basketball">
        <p>Child Element</p>
      </GreetWithName>
      <GreetWithName name="Diana" superhero="WonderWoman" from="Amazon"/>
      <GreetWithName name="Bruce" profile="Billionare"/>
      
      <Welcome name="Peter" />
       */}

      {/* <Message /> */}

      {/* <Counter name="Jordan" age="43"></Counter> */}
      
      {/* <GreetWithName name="Michael Jordan" betterKnown="Air Jordan" won="5"></GreetWithName> */}

      {/* <Welcome name="Lebron James" betterKnown="King" ></Welcome> */}
      
       {/* <FuctionClick></FuctionClick> */}

      <ClassClick></ClassClick>

      {/* <EventBind></EventBind> */}
      
      {/* <ParentComponent></ParentComponent> */}

      {/* <UserGreeting></UserGreeting> */}

      {/* <NameList></NameList> */}

      {/* <StyleSheet></StyleSheet>
       <h1 className={styles.success}>Success</h1>
       <h1 className='error'>Error</h1> */}

      {/* <Form /> */}

      {/* <LifeCycleA /> */}

       {/* <FragmentDemo /> */}

       {/* <Table></Table> */}

       {/* <Clock /> */}

       {/* <CountdownClock target={new Date('November 14, 2020 04:00:00')} event="My Birthday"></CountdownClock> */}

       {/* <CountdownClock target={new Date('January 1, 2021 00:00:00')} event="New Year"></CountdownClock> */}

      </div>
  );
}

export default App;
