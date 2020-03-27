# react-native-pure-badge

This is a module which help you set badge number.

## Installation

```
npm i react-native-pure-badge
// link below 0.60
react-native link react-native-pure-badge
```

## Setup

### iOS

nothing to do.

### Android

nothing to do.

## Usage

```js
import badge from 'react-native-pure-badge'

badge.setBadge(1)

// clear badge
badge.setBadge(0)

// read badge number
badge.getBadge().then(data => {
  // ios worked
  // but android is always 0
  data.badge
})
```