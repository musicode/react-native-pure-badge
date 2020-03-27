
import { NativeModules } from 'react-native'

const { RNTBadge } = NativeModules

export default {

  setBadge(value) {
    RNTBadge.setBadge(value)
  },

}
